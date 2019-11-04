package com.aaa.health.service.zzh;

import com.aaa.health.entity.zzh.Healthcheck;
import com.aaa.health.mapper.zzh.HealthcheckMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class HealthcheckServiceImpl implements HealthcheckService {
    @Autowired
    private HealthcheckMapper healthcheckMapper;

    @Override
    public List<Healthcheck> findList(Map<String, Object> queryMap) {
        return healthcheckMapper.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return  healthcheckMapper.getTotal(queryMap);
    }

    @Override
    public int delete(String ids) {
        return  healthcheckMapper.delete(ids);
    }

    @Override
    public int add(Healthcheck userinfo) {
        return  healthcheckMapper.add(userinfo);
    }

    @Override
    public int edit(Healthcheck userinfo) {
        return  healthcheckMapper.edit(userinfo);
    }

    @Override
    public Healthcheck findById(Long id) {
        return healthcheckMapper.findById(id);
    }
}
