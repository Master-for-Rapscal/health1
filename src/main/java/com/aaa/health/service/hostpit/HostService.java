package com.aaa.health.service.hostpit;

import com.aaa.health.entity.zzh.Healthcheck;
import com.aaa.health.entity.zzh.Userinfo;

import java.util.List;
import java.util.Map;

public interface HostService {

    //查询所有地址
    List<Map<String,Object>> queryArea();
    //添加用户
    Integer addUserInfo(Userinfo userinfo);
    //根据用户的姓名和身份证号进行查询
    List<Healthcheck> queryCheck(Map<String,Object> map);

    //添加用户名字 电话 身份证号
    Integer addUserNPI(Map map);
}
