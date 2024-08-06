package com.rainsoul.subject.infra.basic.service.impl;

import com.rainsoul.subject.infra.basic.entity.SubjectBrief;
import com.rainsoul.subject.infra.basic.mapper.SubjectBriefDao;
import com.rainsoul.subject.infra.basic.service.SubjectBriefService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author RainSoul
 * @create 2024-08-06
 */
@Service("subjectBriefService")
public class SubjectBriefServiceImpl implements SubjectBriefService {

    @Resource
    private SubjectBriefDao subjectBriefDao;

    @Override
    public SubjectBrief queryById(Long id) {
        return  subjectBriefDao.queryById(id);
    }

    @Override
    public SubjectBrief insert(SubjectBrief subjectBrief) {
        int count = subjectBriefDao.insert(subjectBrief);
        if(count > 0){
            return subjectBrief;
        }
        return null;
    }

    @Override
    public SubjectBrief update(SubjectBrief subjectBrief) {
        subjectBriefDao.update(subjectBrief);
        return subjectBrief;
    }

    @Override
    public boolean deleteById(Long id) {
        return subjectBriefDao.deleteById(id) > 0;
    }

    @Override
    public SubjectBrief queryByCondition(SubjectBrief subjectBrief) {
        return subjectBriefDao.queryAllByLimit(subjectBrief);
    }
}
