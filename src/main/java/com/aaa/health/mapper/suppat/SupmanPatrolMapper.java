package com.aaa.health.mapper.suppat;

import com.aaa.health.entity.area.Area;
import com.aaa.health.entity.suppat.SupmanPatrol;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SupmanPatrolMapper {
    List<SupmanPatrol> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    int add(SupmanPatrol supmanPatrol);
    Map<String,Object> findById(Integer patrolId);
    int update(SupmanPatrol supmanPatrol);
    int delete(String ids);
}
