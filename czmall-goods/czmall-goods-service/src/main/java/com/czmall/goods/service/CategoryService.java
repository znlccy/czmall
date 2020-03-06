package com.czmall.goods.service;

import com.czmall.goods.model.Category;

import java.util.List;


public interface CategoryService {

    List<Category> queryCategoriesByPid(Long pid);
}
