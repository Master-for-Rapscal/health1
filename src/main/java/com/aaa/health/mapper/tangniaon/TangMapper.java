package com.aaa.health.mapper.tangniaon;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface TangMapper {
    //查询所有
    List<Map> queryAll(Map map);
    //查询总条数
    int queryTotal(Map map);
    //s删除
    int deleteById(String ids);
    // 查询所有用户
    List<Map> queryAllUser(Map map);
    //用户总条数
    Integer queryUserTotal(Map map);
    //根据用户ID来查询用户
    Map<String,Object> queryUserById(Integer uid);
}
