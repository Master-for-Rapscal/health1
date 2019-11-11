package com.aaa.health.service.indis;

import com.aaa.health.entity.indis.DisfollowUp;
import com.aaa.health.mapper.indis.DisfollowUpMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class DisfollowUpServiceImpl implements DisfollowUpService{
    @Resource
    private DisfollowUpMapper disfollowUpMapper;

    @Override
    public List<Map> queryDoctor() {
        return disfollowUpMapper.queryDoctor();
    }

    @Override
    public int delete(String disfopId) {
        return disfollowUpMapper.delete(disfopId);
    }

    @Override
    public List<DisfollowUp> findById(Integer disfopId) {
        return disfollowUpMapper.findById(disfopId);
    }


    @Override
    public List<DisfollowUp> findId(Integer infdisId) {
        return disfollowUpMapper.findId(infdisId);
    }

    @Override
    public List<DisfollowUp> findUserId(Integer infdisId) {
        return disfollowUpMapper.findUserId(infdisId);
    }

    @Override
    public int update(DisfollowUp disfollowUp) {
        return disfollowUpMapper.update(disfollowUp);
    }

    @Override
    public int add(DisfollowUp disfollowUp) {
        return disfollowUpMapper.add(disfollowUp);
    }

    @Override
    public int getTotal(Integer queryMap) {
        return disfollowUpMapper.getTotal(queryMap);
    }
}
