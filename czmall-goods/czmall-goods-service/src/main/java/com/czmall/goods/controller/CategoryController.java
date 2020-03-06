package com.czmall.goods.controller;

import com.czmall.goods.model.Category;
import com.czmall.goods.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName: CategoryController
 * FileName：CategoryController.java
 * Description：
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2020-03-04 22:04		create
 */
@RestController
@RequestMapping(value = "/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 获取类目列表
     * @param pid
     * @return
     */
    @GetMapping(value = "/list")
    public ResponseEntity queryCategoriesByPid(@RequestParam(value = "pid",defaultValue = "0") Long pid) {
        try {
            System.out.println("测试");
            //400参数不合法
            /*if (pid == null || pid < 0) {
                //return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
                //return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
                return ResponseEntity.badRequest().build();
            }
            List<Category> categories = this.categoryService.queryCategoriesByPid(pid);
            if (CollectionUtils.isEmpty(categories)) {
                //404资源服务器不合法
                //return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
                return ResponseEntity.notFound().build();
            }*/
            //200 查询成功
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //500 服务器内部错误
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
}
