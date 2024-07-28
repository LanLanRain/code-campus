package com.rainsoul.subject.common.enums;

import lombok.Getter;

/**
 * @author RainSoul
 * @create
 * @lombok.Getter2024-07-28
 */
@Getter
public enum ResultCodeEnum {
    SUCCESS(200, "成功"),
    FAIL(500, "失败");

    public int code;
    public String msg;

    ResultCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static ResultCodeEnum getByCode(int codeValue){
        for (ResultCodeEnum resultCodeEnum : ResultCodeEnum.values()) {
            if (codeValue == resultCodeEnum.code) {
                return resultCodeEnum;
            }
        }
        return null;
    }
}
