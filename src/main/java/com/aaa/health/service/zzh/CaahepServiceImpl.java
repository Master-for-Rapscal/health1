package com.aaa.health.service.zzh;

import com.aaa.health.entity.zzh.Caahep;
import com.aaa.health.entity.zzh.Healthcheck;
import com.aaa.health.mapper.zzh.CaahepMapper;
import com.aaa.health.mapper.zzh.HealthcheckMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CaahepServiceImpl implements CaahepService {
    @Autowired
    private CaahepMapper caahepMapper;


    @Override
    public List<Caahep> findList(Map<String, Object> queryMap) {
        return caahepMapper.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return caahepMapper.getTotal(queryMap);
    }

    @Override
    public int delete(String ids) {
        return caahepMapper.delete(ids);
    }

    @Override
    public int add(Caahep caahep) {
        return caahepMapper.add(caahep);
    }

    @Override
    public int edit(Caahep caahep) {
        return caahepMapper.edit(caahep);
    }

    @Override
    public Caahep findById(Long id) {
        return caahepMapper.findById(id);
    }
}
