package com.aaa.health.mapper.pultub;

import com.aaa.health.entity.pultub.Puserinfo;
import com.aaa.health.entity.zzh.Userinfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface PuserinfoMapper {
    List<Puserinfo> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    //根据用户ID来查询用户
    Map<String,Object> queryUserById(Integer userId);
}
