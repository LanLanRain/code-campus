package com.rainsoul.subject.infra.basic.service.impl;

import com.rainsoul.subject.infra.basic.entity.SubjectInfo;
import com.rainsoul.subject.infra.basic.mapper.SubjectInfoDao;
import com.rainsoul.subject.infra.basic.service.SubjectInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author RainSoul
 * @create 2024-08-06
 */
@Service("subjectInfoService")
public class SubjectInfoServiceImpl implements SubjectInfoService {
    @Resource
    private SubjectInfoDao subjectInfoDao;

    @Override
    public SubjectInfo queryById(Long id) {
        return subjectInfoDao.queryById(id);
    }

    @Override
    public SubjectInfo insert(SubjectInfo subjectInfo) {
        subjectInfoDao.insert(subjectInfo);
        return subjectInfo;
    }

    @Override
    public SubjectInfo update(SubjectInfo subjectInfo) {
        subjectInfoDao.update(subjectInfo);
        return queryById(subjectInfo.getId());
    }

    @Override
    public boolean deleteById(Long id) {
        return subjectInfoDao.deleteById(id) > 0;
    }

    @Override
    public int countByCondition(SubjectInfo subjectInfo, Long categoryId, Long labelId) {
        return subjectInfoDao.countByCondition(subjectInfo, categoryId, labelId);
    }

    @Override
    public List<SubjectInfo> queryPage(SubjectInfo subjectInfo, Long categoryId, Long labelId, int start, Integer pageSize) {
        return subjectInfoDao.queryPage(subjectInfo, categoryId, labelId, start, pageSize);
    }

    @Override
    public List<SubjectInfo> getContributeCount() {
        return subjectInfoDao.getContributeCount();
    }

    @Override
    public Long querySubjectIdCursor(Long subjectId, Long categoryId, Long labelId, int cursor) {
        return subjectInfoDao.querySubjectIdCursor(subjectId, categoryId, labelId, cursor);
    }
}
