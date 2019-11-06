package com.aaa.health.mapper.outco;

import com.aaa.health.entity.outco.OutCome;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface OutComeMapper {
    List<OutCome> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    int add(OutCome outCome);
    int update(OutCome outCome);
    int delete(String ids);
}
