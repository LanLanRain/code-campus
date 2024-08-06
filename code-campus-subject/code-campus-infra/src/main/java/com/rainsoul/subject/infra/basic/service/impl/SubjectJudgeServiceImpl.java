package com.rainsoul.subject.infra.basic.service.impl;

import com.rainsoul.subject.infra.basic.entity.SubjectJudge;
import com.rainsoul.subject.infra.basic.mapper.SubjectJudgeDao;
import com.rainsoul.subject.infra.basic.service.SubjectJudgeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author RainSoul
 * @create 2024-08-06
 */
@Service("subjectJudgeService")
public class SubjectJudgeServiceImpl implements SubjectJudgeService {

    @Resource
    private SubjectJudgeDao subjectJudgeDao;

    @Override
    public SubjectJudge queryById(Long id) {
        return subjectJudgeDao.queryById(id);
    }

    @Override
    public SubjectJudge insert(SubjectJudge subjectJudge) {
        subjectJudgeDao.insert(subjectJudge);
        return subjectJudge;
    }

    @Override
    public SubjectJudge update(SubjectJudge subjectJudge) {
        subjectJudgeDao.update(subjectJudge);
        return queryById(subjectJudge.getId());
    }

    @Override
    public boolean deleteById(Long id) {
        return subjectJudgeDao.deleteById(id) > 0;
    }

    @Override
    public List<SubjectJudge> queryByCondition(SubjectJudge subjectJudge) {
        return subjectJudgeDao.queryAllByLimit(subjectJudge);
    }
}
