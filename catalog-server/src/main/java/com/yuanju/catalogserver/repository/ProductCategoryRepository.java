package com.yuanju.catalogserver.repository;

import com.yuanju.catalogcommon.CategoryOutput;
import com.yuanju.catalogserver.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * author: LinjianXiong
 * Date: 2019/1/11
 * Time: 16:06
 */
@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    List<ProductCategory> findByCategoryIdIn(List<Integer> ids);

    /**
     * @Description 查询非父级的类别
     * @Author LJX
     * @Date 2019/1/13 0:56
     * @param isParent
     * @return java.util.List<com.yuanju.catalogserver.dataobject.ProductCategory>
     */
    List<ProductCategory> findByIsParent(Integer isParent);

}
