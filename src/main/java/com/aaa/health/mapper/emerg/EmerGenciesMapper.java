package com.aaa.health.mapper.emerg;

import com.aaa.health.entity.area.Area;
import com.aaa.health.entity.emerg.EmerGencies;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface EmerGenciesMapper {
    List<EmerGencies> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    int add(EmerGencies emerGencies);
    int update(EmerGencies emerGencies);
    int delete(String ids);
    List<Area> findArea();
}
