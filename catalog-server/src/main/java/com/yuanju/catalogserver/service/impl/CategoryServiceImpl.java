package com.yuanju.catalogserver.service.impl;

import com.yuanju.catalogcommon.CategoryOutput;
import com.yuanju.catalogserver.dataobject.ProductCategory;
import com.yuanju.catalogserver.enums.CategoryIsParentEnum;
import com.yuanju.catalogserver.repository.ProductCategoryRepository;
import com.yuanju.catalogserver.service.CategoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * author: LinjianXiong
 * Date: 2019/1/11
 * Time: 17:23
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<CategoryOutput> findByCategoryIdIn(List<Integer> ids) {
        return productCategoryRepository.findByCategoryIdIn(ids).stream()
                .map(e -> {
                    CategoryOutput output = new CategoryOutput();
                    BeanUtils.copyProperties(e, output);
                    return  output;
                })
                .collect(Collectors.toList());
    }

    @Override
    public List<CategoryOutput> findCategoryByIsParent() {
        return productCategoryRepository.findByIsParent(CategoryIsParentEnum.FP.getCode()).stream()
                .map(e -> {
                    CategoryOutput output = new CategoryOutput();
                    BeanUtils.copyProperties(e, output);
                    return output;
                })
                .collect(Collectors.toList());
    }
}
