package com.yuanju.catalogcommon;

import lombok.Data;

import java.util.Date;

/**
 * author: LinjianXiong
 * Date: 2019/1/11
 * Time: 21:25
 */
@Data
public class CategoryOutput {

    private Integer categoryId;

    // 类别名称
    private String categoryName;

    // 父分类id
    private Integer parentId;

    private String level;

    // 是否为父级分类  1是true,0是false
    private Integer isParent;

    // 图标
    private String icon;

    // 备注
    private String remark;

    private Date createTime;
    private Date updateTime;

    // 状态  1表启用；0表禁用
    private Integer categoryState;
}
