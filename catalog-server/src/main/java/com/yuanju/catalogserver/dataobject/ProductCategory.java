package com.yuanju.catalogserver.dataobject;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * author: LinjianXiong
 * Date: 2019/1/11
 * Time: 15:43
 */
@Table(name = "tb_category")
@Data
@Entity
public class ProductCategory {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer categoryId;

    // 类别名称
    @Column(name = "name")
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
    @Column(name = "state")
    private Integer categoryState;

}
