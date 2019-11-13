package com.aaa.health.mapper.supman;

import com.aaa.health.entity.area.Area;
import com.aaa.health.entity.supman.SupmanReport;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SupmanReportMapper {
    List<SupmanReport> findList(Map <String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    int add(SupmanReport supmanReport);
    int update(SupmanReport supmanReport);
    int delete(String ids);
    /*List<area> findArea();*/
}
