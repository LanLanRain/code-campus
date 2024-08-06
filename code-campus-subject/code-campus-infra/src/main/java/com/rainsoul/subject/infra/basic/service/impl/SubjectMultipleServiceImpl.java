package com.rainsoul.subject.infra.basic.service.impl;

import com.rainsoul.subject.infra.basic.entity.SubjectMultiple;
import com.rainsoul.subject.infra.basic.mapper.SubjectMultipleDao;
import com.rainsoul.subject.infra.basic.service.SubjectMultipleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

/**
 * @author RainSoul
 * @create 2024-08-06
 */
@Service("subjectMultipleService")
public class SubjectMultipleServiceImpl implements SubjectMultipleService {

    @Resource
    private SubjectMultipleDao subjectMultipleDao;

    @Override
    public SubjectMultiple queryById(Long id) {
        return subjectMultipleDao.queryById(id);
    }

    @Override
    public SubjectMultiple insert(SubjectMultiple subjectMultiple) {
        subjectMultipleDao.insert(subjectMultiple);
        return subjectMultiple;
    }

    @Override
    public SubjectMultiple update(SubjectMultiple subjectMultiple) {
        subjectMultipleDao.update(subjectMultiple);
        return subjectMultipleDao.queryById(subjectMultiple.getId())    ;
    }

    @Override
    public boolean deleteById(Long id) {
        return subjectMultipleDao.deleteById(id) > 0;
    }

    @Override
    public void batchInsert(List<SubjectMultiple> subjectMultipleList) {
        subjectMultipleDao.insertBatch(subjectMultipleList);
    }

    @Override
    public List<SubjectMultiple> queryByCondition(SubjectMultiple subjectMultiple) {
        return subjectMultipleDao.queryAllByLimit(subjectMultiple);
    }
}
