package com.aaa.health.mapper.zzh;

import com.aaa.health.entity.zzh.Userinfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserinfoMapper {

//    UserInfo findByUsername(String username);
//    int add(UserInfo userInfo);
//    int edit(UserInfo userInfo);
//    int editPassword(UserInfo userInfo);
//    int delete(String ids);
    List<Userinfo> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
}
