package com.rainsoul.subject.domain.service;

import com.rainsoul.subject.domain.entity.SubjectCategoryBO;

import java.util.List;

/**
 * @author RainSoul
 * @create 2024-07-28
 */
public interface SubjectCategoryDomainService {
    void add(SubjectCategoryBO subjectCategoryBO);

    List<SubjectCategoryBO> queryCategory(SubjectCategoryBO subjectCategoryBO);

    Boolean update(SubjectCategoryBO subjectCategoryBO);

    Boolean delete(SubjectCategoryBO subjectCategoryBO);
}
