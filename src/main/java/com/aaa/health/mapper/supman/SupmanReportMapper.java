package com.aaa.health.mapper.supman;

import com.aaa.health.entity.supman.SupmanReport;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface SupmanReportMapper {
    List<SupmanReport> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    int add(SupmanReport supmanReport);
    Map<String,Object> findById(Integer reportId);
    int update(SupmanReport supmanReport);
    int delete(String ids);
}
