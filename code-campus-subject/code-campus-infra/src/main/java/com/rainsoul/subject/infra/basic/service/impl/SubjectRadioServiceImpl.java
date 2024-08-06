package com.rainsoul.subject.infra.basic.service.impl;

import com.rainsoul.subject.infra.basic.entity.SubjectRadio;
import com.rainsoul.subject.infra.basic.mapper.SubjectRadioDao;
import com.rainsoul.subject.infra.basic.service.SubjectRadioService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author RainSoul
 * @create 2024-08-06
 */
@Service("subjectRadioService")
public class SubjectRadioServiceImpl implements SubjectRadioService {
    @Resource
    private SubjectRadioDao subjectRadioDao;

    @Override
    public SubjectRadio queryById(Long id) {
        return subjectRadioDao.queryById(id);
    }

    @Override
    public SubjectRadio insert(SubjectRadio subjectRadio) {
        subjectRadioDao.insert(subjectRadio);
        return subjectRadio;
    }

    @Override
    public void batchInsert(List<SubjectRadio> subjectRadioList) {
        subjectRadioDao.insertBatch(subjectRadioList);
    }

    @Override
    public SubjectRadio update(SubjectRadio subjectRadio) {
        subjectRadioDao.update(subjectRadio);
        return subjectRadioDao.queryById(subjectRadio.getId());
    }

    @Override
    public boolean deleteById(Long id) {
        return subjectRadioDao.deleteById(id) > 0;
    }

    @Override
    public List<SubjectRadio> queryByCondition(SubjectRadio subjectRadio) {
        return subjectRadioDao.queryAllByLimit(subjectRadio);
    }
}
