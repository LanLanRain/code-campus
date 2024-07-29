package com.rainsoul.subject.infra.basic.service.impl;

import com.rainsoul.subject.infra.basic.entity.SubjectCategory;
import com.rainsoul.subject.infra.basic.mapper.SubjectCategoryDao;
import com.rainsoul.subject.infra.basic.service.SubjectCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author RainSoul
 * @create 2024-07-27
 */
@Service("subjectCategoryService")
@Slf4j
public class SubjectCategoryServiceImpl implements SubjectCategoryService {

    @Resource
    private SubjectCategoryDao subjectCategoryDao;

    @Override
    public SubjectCategory insert(SubjectCategory subjectCategory) {
        if(log.isInfoEnabled()) {
            log.info("SubjectCategoryController.add.subjectCategory:{}", subjectCategory);
        }
        subjectCategoryDao.insert(subjectCategory);
        return subjectCategory;
    }

    @Override
    public SubjectCategory queryById(Long id) {
        return subjectCategoryDao.queryById(id);
    }

    @Override
    public int update(SubjectCategory subjectCategory) {
        return subjectCategoryDao.update(subjectCategory);
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public List<SubjectCategory> queryCategory(SubjectCategory subjectCategory) {
        return subjectCategoryDao.queryCategory(subjectCategory);
    }
}
