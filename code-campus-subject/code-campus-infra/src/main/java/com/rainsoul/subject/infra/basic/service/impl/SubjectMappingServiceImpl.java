package com.rainsoul.subject.infra.basic.service.impl;

import com.rainsoul.subject.infra.basic.entity.SubjectMapping;
import com.rainsoul.subject.infra.basic.mapper.SubjectMappingDao;
import com.rainsoul.subject.infra.basic.service.SubjectMappingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author RainSoul
 * @create 2024-08-05
 */
@Service("subjectMappingService")
public class SubjectMappingServiceImpl implements SubjectMappingService {

    @Resource
    private SubjectMappingDao subjectMappingDao;

    @Override
    public SubjectMapping queryById(int id) {
        return subjectMappingDao.queryById(id);
    }

    @Override
    public SubjectMapping insert(SubjectMapping subjectMapping) {
        subjectMappingDao.insert(subjectMapping);
        return subjectMapping;
    }

    @Override
    public int update(SubjectMapping subjectMapping) {
        return subjectMappingDao.update(subjectMapping);
    }

    @Override
    public boolean deleteById(int id) {
        return subjectMappingDao.deleteById(id) > 0;
    }

    @Override
    public List<SubjectMapping> queryLabelId(SubjectMapping subjectMapping) {
        return subjectMappingDao.queryDistinctLabelId(subjectMapping);
    }

    @Override
    public void batchInsert(List<SubjectMapping> mappingList) {

    }
}
