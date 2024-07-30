package com.rainsoul.subject.common.enums;

/**
 * @author RainSoul
 * @create 2024-07-30
 */
public enum IsDeletedFlagEnum {
    DELETED(1, "已删除"),
    UN_DELETED(0, "未删除");

    public int code;
    public String desc;

    private IsDeletedFlagEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static IsDeletedFlagEnum getByCode(int code) {
        for (IsDeletedFlagEnum isDeletedFlagEnum : IsDeletedFlagEnum.values()) {
            if (code == isDeletedFlagEnum.code) {
                return isDeletedFlagEnum;
            }
        }
        return null;
    }
}
