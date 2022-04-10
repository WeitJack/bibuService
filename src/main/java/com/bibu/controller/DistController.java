package com.bibu.controller;

import com.bibu.entity.Dist;
import com.bibu.service.DistService;
import com.github.pagehelper.PageInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 数据字典表(Dist)表控制层
 *
 * @author WeitJack
 * @since 2022-04-10 21:36:54
 */
@RestController
@RequestMapping("api/dist")
public class DistController {
    /**
     * 服务对象
     */
    @Resource
    private DistService distService;

    /**
     * 分页查询
     *
     * @param dist 筛选条件
     * @return 查询结果
     */
    @PostMapping("list")
    public ResponseEntity<PageInfo<Dist>> queryByPage(@RequestBody Dist dist) {
        return ResponseEntity.ok(this.distService.queryByPage(dist));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("get/{id}")
    public ResponseEntity<Dist> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.distService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param dist 实体
     * @return 新增结果
     */
    @PostMapping("add")
    public ResponseEntity<Dist> add(@RequestBody Dist dist) {
        return ResponseEntity.ok(this.distService.insert(dist));
    }

    /**
     * 编辑数据
     *
     * @param dist 实体
     * @return 编辑结果
     */
    @PostMapping("edit")
    public ResponseEntity<Dist> edit(@RequestBody Dist dist) {
        return ResponseEntity.ok(this.distService.update(dist));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @GetMapping("delete/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.distService.deleteById(id));
    }

}

