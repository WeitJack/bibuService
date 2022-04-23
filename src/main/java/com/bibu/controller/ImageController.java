package com.bibu.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Image控制层
 *
 * @author WeitJack
 * @since 2022-04-23 16:07:52
 */
@RestController
@RequestMapping("api/image")
public class ImageController {

    @Autowired
    private Environment environment;

    /**
     * 图片上传
     * @param file 待上传图片
     * @return 返回图片路径，名称
     * @throws IOException io异常
     */
    @RequestMapping("upload")
    public ResponseEntity<Map> uploadFile(@Param("file") MultipartFile file) throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSS");
        String res = sdf.format(new Date());
        String rootPath = environment.getProperty("file.rootPath");
        String originalFilename = file.getOriginalFilename();
        String newFileName = null;
        if (originalFilename != null) {
            newFileName = res + originalFilename.substring(originalFilename.lastIndexOf("."));
        }
        Calendar date = Calendar.getInstance();
        File dateDirs = new File(date.get(Calendar.YEAR) + File.separator + (date.get(Calendar.MONTH) + 1));
        File newFile = new File(rootPath + File.separator + dateDirs + File.separator + newFileName);
        if (!newFile.getParentFile().exists()) {
            newFile.getParentFile().mkdirs();
        }
        System.out.println(newFile);
        file.transferTo(newFile);
        String fileUrl = rootPath + File.separator + dateDirs + File.separator +  newFileName;
        Map<String, String> data = new HashMap<>();
        data.put("src", fileUrl);
        data.put("title", file.getOriginalFilename());
        return ResponseEntity.ok(data);
    }

    /**
     * 查看图片
     * @param path 查看的图片路径
     * @return 返回图片字节流
     * @throws IOException io异常
     */
    @RequestMapping(value = "/look",produces = {MediaType.IMAGE_JPEG_VALUE , MediaType.IMAGE_PNG_VALUE})
    @ResponseBody
    public byte[] look(@Param("path") String path) throws IOException {
        File file = new File(path);
        FileInputStream inputStream = new FileInputStream(file);
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes, 0, inputStream.available());
        return bytes;
    }

    /**
     * 删除图片
     * @param path 图片路径
     * @return 已图片路径
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public ResponseEntity<String> delete(@Param("path") String path) {
        File file = new File(path);
        file.delete();
        return ResponseEntity.ok("已删除图片："+path);
    }
}
