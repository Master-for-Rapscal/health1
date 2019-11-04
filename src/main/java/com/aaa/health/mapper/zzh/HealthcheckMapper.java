package com.aaa.health.mapper.zzh;

import com.aaa.health.entity.zzh.Healthcheck;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface HealthcheckMapper {

    List<Healthcheck> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    int delete(String ids);
    int add(Healthcheck userinfo);
    int edit(Healthcheck userinfo);
    Healthcheck findById(Long id);
}