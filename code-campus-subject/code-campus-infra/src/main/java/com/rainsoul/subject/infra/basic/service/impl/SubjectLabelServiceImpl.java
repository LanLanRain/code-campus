package com.rainsoul.subject.infra.basic.service.impl;

import com.rainsoul.subject.infra.basic.entity.SubjectLabel;
import com.rainsoul.subject.infra.basic.service.SubjectLabelService;

import java.util.Collections;
import java.util.List;

/**
 * @author RainSoul
 * @create 2024-07-30
 */
public class SubjectLabelServiceImpl implements SubjectLabelService {
    @Override
    public SubjectLabel queryById(Long id) {
        return null;
    }

    @Override
    public int insert(SubjectLabel subjectLabel) {
        return 0;
    }

    @Override
    public int update(SubjectLabel subjectLabel) {
        return 0;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public List<SubjectLabel> batchQueryById(List<Long> labelIdList) {
        return Collections.emptyList();
    }

    @Override
    public List<SubjectLabel> queryByCondition(SubjectLabel subjectLabel) {
        return Collections.emptyList();
    }
}
