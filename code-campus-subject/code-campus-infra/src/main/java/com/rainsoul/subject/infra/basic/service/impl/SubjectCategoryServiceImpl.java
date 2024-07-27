package com.rainsoul.subject.infra.basic.service.impl;

import com.rainsoul.subject.infra.basic.entity.SubjectCategory;
import com.rainsoul.subject.infra.basic.mapper.SubjectCategoryDao;
import com.rainsoul.subject.infra.basic.service.SubjectCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
        return null;
    }

    @Override
    public SubjectCategory queryById(Long id) {
        return subjectCategoryDao.queryById(id);
    }

    @Override
    public int update(SubjectCategory subjectCategory) {
        return 0;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }
}
