package com.yuanju.catalogserver.service;

import com.yuanju.catalogcommon.CategoryOutput;
import com.yuanju.catalogserver.CatalogServerApplicationTests;
import com.yuanju.catalogserver.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * author: LinjianXiong
 * Date: 2019/1/11
 * Time: 17:25
 */
@Component
public class CategoryServiceTest extends CatalogServerApplicationTests {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void findByCategoryIdIn() {
        List<CategoryOutput> list = categoryService.findByCategoryIdIn(Arrays.asList(1,2));
        Assert.assertTrue(list.size() > 0);
    }
}