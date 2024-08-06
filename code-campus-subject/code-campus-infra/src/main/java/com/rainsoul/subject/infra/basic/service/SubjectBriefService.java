package com.rainsoul.subject.infra.basic.service;

import com.rainsoul.subject.infra.basic.entity.SubjectBrief;

/**
 * @author RainSoul
 * @create 2024-08-06
 */
public interface SubjectBriefService {
    SubjectBrief queryById(Long id);

    SubjectBrief insert(SubjectBrief subjectBrief);

    SubjectBrief update(SubjectBrief subjectBrief);

    boolean deleteById(Long id);

    SubjectBrief queryByCondition(SubjectBrief subjectBrief);
}
