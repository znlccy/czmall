package com.czmall.goods.service.impl;

import com.czmall.goods.mapper.CategoryMapper;
import com.czmall.goods.model.Category;
import com.czmall.goods.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: CategoryServiceImpl
 * FileName：CategoryServiceImpl.java
 * Description：
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2020-03-04 22:01		create
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 根据父节点查询子节点
     * @param pid
     * @return
     */
    @Override
    public List<Category> queryCategoriesByPid(Long pid) {
        Category record = new Category();
        record.setParentId(pid);
        return this.categoryMapper.select(record);
    }
}
