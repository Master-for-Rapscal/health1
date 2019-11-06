package com.aaa.health.mapper.anfoll;

import com.aaa.health.entity.anfoll.AnteFollow;
import com.aaa.health.entity.zzh.Userinfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface AnteFollowMapper {
    List<Userinfo> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    int add(Userinfo userinfo);
    int update(Userinfo userinfo);
    int delete(String ids);
}
