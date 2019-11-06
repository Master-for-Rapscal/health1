package com.aaa.health.mapper.womandis;

import com.aaa.health.entity.womandis.WomanDisease;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface WomanDiseaseMapper {
    List<WomanDisease> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    int add(WomanDisease womanDisease);
    int update(WomanDisease womanDisease);
    int delete(String ids);
    //List<WomanDisease> queryRe(Integer wodisId);
}
