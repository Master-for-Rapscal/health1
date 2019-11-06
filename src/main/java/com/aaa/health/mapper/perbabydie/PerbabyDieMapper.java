package com.aaa.health.mapper.perbabydie;

import com.aaa.health.entity.perbabyDie.PerbabyDie;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PerbabyDieMapper {
    List<PerbabyDie> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
}
