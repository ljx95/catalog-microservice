package com.yuanju.catalogserver.enums;

import lombok.Getter;

/**
 * author: LinjianXiong
 * Date: 2019/1/13
 * Time: 0:34
 */
@Getter
public enum CategoryIsParentEnum {
    FP(0, "false"),
    TP(1, "true"),
    ;

    private Integer code;
    private String message;

    CategoryIsParentEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }
}
