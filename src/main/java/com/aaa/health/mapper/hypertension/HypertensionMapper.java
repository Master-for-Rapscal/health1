package com.aaa.health.mapper.hypertension;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface HypertensionMapper {
    //查询所有
    List<Map> queryAll(Map map);
    //查询所有条数
    int queryTotal(Map map);
    //删除
    int deleteById(String hid);

    List<Map>queryAllUser(Map map);

    Integer queryUserTotal(Map map);
}
