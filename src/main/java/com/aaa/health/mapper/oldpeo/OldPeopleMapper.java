package com.aaa.health.mapper.oldpeo;

import com.aaa.health.entity.admin.SysUser;
import com.aaa.health.entity.oldpeo.Oldpeo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface OldPeopleMapper {

    public int delete(String ids);
    List<Map> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    // 查询所有用户
    List<Map> queryAllUser(Map map);
    //用户总条数
    Integer queryUserTotal(Map map);
}
