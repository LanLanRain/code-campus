package com.rainsoul.subject.application.dto;

import lombok.Data;

/**
 * @author RainSoul
 * @create 2024-07-30
 */
@Data
public class SubjectLabelDTO {
    /**
     * 主键
     */
    private Long id;

    /**
     * 分类id
     */
    private Long categoryId;

    /**
     * 标签分类
     */
    private String labelName;
    /**
     * 排序
     */
    private Integer sortNum;
}
