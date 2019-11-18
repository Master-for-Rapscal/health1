package com.aaa.health.service.supman;

import com.aaa.health.entity.area.Area;
import com.aaa.health.entity.supman.SupmanReport;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface SupmanReportService {
    List<SupmanReport> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    int add(SupmanReport supmanReport);
    Map<String,Object> findById(Integer reportId);
    int update(SupmanReport supmanReport);
    int delete(String ids);
}
