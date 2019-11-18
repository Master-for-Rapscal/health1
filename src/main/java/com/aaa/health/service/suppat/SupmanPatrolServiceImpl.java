package com.aaa.health.service.suppat;

import com.aaa.health.entity.area.Area;
import com.aaa.health.entity.suppat.SupmanPatrol;
import com.aaa.health.mapper.suppat.SupmanPatrolMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class SupmanPatrolServiceImpl implements SupmanPatrolService{
    @Resource
    private SupmanPatrolMapper supmanPatrolMapper;
    @Override
    public List<SupmanPatrol> findList(Map<String, Object> queryMap) {
        return supmanPatrolMapper.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return supmanPatrolMapper.getTotal(queryMap);
    }

    @Override
    public int add(SupmanPatrol supmanPatrol) {
        return supmanPatrolMapper.add(supmanPatrol);
    }

    @Override
    public Map<String, Object> findById(Integer patrolId) {
        return supmanPatrolMapper.findById(patrolId);
    }

    @Override
    public int update(SupmanPatrol supmanPatrol) {
        return supmanPatrolMapper.update(supmanPatrol);
    }

    @Override
    public int delete(String ids) {
        return supmanPatrolMapper.delete(ids);
    }
}
