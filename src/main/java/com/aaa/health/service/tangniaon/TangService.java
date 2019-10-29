package com.aaa.health.service.tangniaon;

import java.util.List;
import java.util.Map;

public interface TangService {
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
