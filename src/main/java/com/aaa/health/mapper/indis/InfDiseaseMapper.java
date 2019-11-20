package com.aaa.health.mapper.indis;

import com.aaa.health.entity.anfoll.AnteFollow;
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
    Map<String,Object> findById(Integer infdisId);
    int edit(InfDisease infDisease);
    int delete(String ids);
    Map<String,Object> findComeId(Integer infdisId);
    int update(InfDisease infDisease);
}
