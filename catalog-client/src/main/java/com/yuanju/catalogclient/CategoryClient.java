package com.yuanju.catalogclient;


import com.yuanju.catalogcommon.CategoryOutput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * author: LinjianXiong
 * Date: 2019/1/11
 * Time: 20:22
 */
@FeignClient(name = "catalog-microservice")
public interface CategoryClient {

    @PostMapping("/category/listForCategoryIds")
    List<CategoryOutput> listForIds(@RequestBody List<Integer> ids);

    @GetMapping("/category/listForIsParent")
    List<CategoryOutput> listForIsParent();
}
