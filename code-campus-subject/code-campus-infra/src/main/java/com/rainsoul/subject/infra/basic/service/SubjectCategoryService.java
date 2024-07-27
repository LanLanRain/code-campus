package com.rainsoul.subject.infra.basic.service;

import com.rainsoul.subject.infra.basic.entity.SubjectCategory;

/**
 * @author RainSoul
 * @create 2024-07-27
 */
public interface SubjectCategoryService {
    /**
     * 插入题目分类
     * @param subjectCategory
     * @return
     */
    SubjectCategory insert(SubjectCategory subjectCategory);

    /**
     * 通过ID查找一条题目分类
     * @param id
     * @return
     */
    SubjectCategory queryById(Long id);

    /**
     * 修改数据
     * @param subjectCategory
     * @return
     */
    int update(SubjectCategory subjectCategory);

    /**
     * 通过主键id删除数据
     * @param id
     * @return
     */
    boolean deleteById(Long id);
}
