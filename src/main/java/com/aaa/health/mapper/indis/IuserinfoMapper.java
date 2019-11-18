package com.aaa.health.mapper.indis;

import com.aaa.health.entity.pultub.Puserinfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface IuserinfoMapper {
    List<Puserinfo> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    //根据用户ID来查询用户
    Map<String,Object> queryUserById(Integer userId);
}
