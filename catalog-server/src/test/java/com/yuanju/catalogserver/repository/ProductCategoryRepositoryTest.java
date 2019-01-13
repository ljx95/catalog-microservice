package com.yuanju.catalogserver.repository;

import com.yuanju.catalogcommon.CategoryOutput;
import com.yuanju.catalogserver.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * author: LinjianXiong
 * Date: 2019/1/11
 * Time: 16:56
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findByIdIn() throws Exception{
        List<ProductCategory> list = productCategoryRepository.findByCategoryIdIn(Arrays.asList(1,2));
        Assert.assertTrue(list.size() > 0);
    }

    @Test
    public void findByIsParent() throws Exception {
        List<ProductCategory> list = productCategoryRepository.findByIsParent(0);
        Assert.assertTrue(list.size() > 0);
    }
}