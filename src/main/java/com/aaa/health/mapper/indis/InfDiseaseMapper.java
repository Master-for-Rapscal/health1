package com.aaa.health.mapper.indis;

import com.aaa.health.entity.indis.InfDisease;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface InfDiseaseMapper {
    List<InfDisease> findUserinfo(Map<String, Object> queryMap);
    List<Map> queryDoctor();
    List<InfDisease> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    int add(InfDisease infDisease);
    int update(InfDisease infDisease);
    int delete(String ids);
}
