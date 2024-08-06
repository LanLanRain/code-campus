package com.rainsoul.subject.common.enums;

import lombok.Getter;

/**
 * @author RainSoul
 * @create 2024-08-05
 */
@Getter
public enum SubjectInfoTypeEnum {
    RADIO(1, "单选"),
    MULTIPLE(2, "多选"),
    JUDGE(3, "判断"),
    BRIEF(4, "简答");

    private int code;
    private String desc;

    SubjectInfoTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static SubjectInfoTypeEnum getByCode(int code) {
        for (SubjectInfoTypeEnum item : SubjectInfoTypeEnum.values()) {
            if (item.getCode() == code) {
                return item;
            }
        }
        return null;
    }
}
