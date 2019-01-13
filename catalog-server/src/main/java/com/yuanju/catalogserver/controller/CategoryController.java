package com.yuanju.catalogserver.controller;

import com.yuanju.catalogcommon.CategoryOutput;
import com.yuanju.catalogserver.dataobject.ProductCategory;
import com.yuanju.catalogserver.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * author: LinjianXiong
 * Date: 2019/1/11
 * Time: 21:09
 */
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * @Description
     * 通过商品类别id获取对应的类别信息
     * @Author LJX
     * @Date 2019/1/11
     * @param ids
     * @return java.util.List<com.yuanju.catalogserver.dataobject.ProductCategory>
     */
    @PostMapping("/listForCategoryIds")
    public List<CategoryOutput> listForIds(@RequestBody List<Integer> ids){
        return categoryService.findByCategoryIdIn(ids);
    }

    @GetMapping("/listForIsParent")
    public List<CategoryOutput> listForIsParent(){
        return categoryService.findCategoryByIsParent();
    }

}
