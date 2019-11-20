package com.aaa.health.mapper.admin;


import com.aaa.health.entity.zzh.Userinfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface LoginMapper {

    List<Userinfo> LoginCheck(Map<String,Object> map);
}
