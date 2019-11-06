package com.aaa.health.mapper.zzh;

import com.aaa.health.entity.zzh.Caahep;
import com.aaa.health.entity.zzh.Healthcheck;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CaahepMapper {

    List<Caahep> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    int delete(String ids);
    int add(Caahep caahep);
    int edit(Caahep caahep);
    Caahep findById(Long id);
}
