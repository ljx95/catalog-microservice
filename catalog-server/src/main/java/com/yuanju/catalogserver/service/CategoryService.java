package com.yuanju.catalogserver.service;

import com.yuanju.catalogcommon.CategoryOutput;
import com.yuanju.catalogserver.dataobject.ProductCategory;

import java.util.List;

/**
 * author: LinjianXiong
 * Date: 2019/1/11
 * Time: 17:21
 */
public interface CategoryService {

    /**
     * @Description
     * @Author LJX
     * @Date 2019/1/11
     * @param ids
     * @return java.util.List<com.yuanju.catalogserver.dataobject.ProductCategory>
     */
    List<CategoryOutput> findByCategoryIdIn(List<Integer> ids);

    /**
     * @Description  获取非父级的所有类别
     * @Author LJX
     * @Date 2019/1/13 0:59
     * @param isParent
     * @return java.util.List<com.yuanju.catalogcommon.CategoryOutput>
     */
    List<CategoryOutput> findCategoryByIsParent();
}
