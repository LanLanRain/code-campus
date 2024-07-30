package com.rainsoul.subject.common.enums;

/**
 * @author RainSoul
 * @create 2024-07-30
 */
public enum CategoryTypeEnum {

    PRIMARY(1, "岗位大类"),
    SECOND(2, "二级分类");

    public int code;

    public String desc;

    CategoryTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static CategoryTypeEnum getByCode(int code) {
        for (CategoryTypeEnum e : CategoryTypeEnum.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
