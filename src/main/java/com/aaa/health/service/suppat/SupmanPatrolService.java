package com.aaa.health.service.suppat;

import com.aaa.health.entity.area.Area;
import com.aaa.health.entity.suppat.SupmanPatrol;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface SupmanPatrolService {
    List<SupmanPatrol> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    int add(SupmanPatrol supmanPatrol);
    int update(SupmanPatrol supmanPatrol);
    int delete(String ids);
}
