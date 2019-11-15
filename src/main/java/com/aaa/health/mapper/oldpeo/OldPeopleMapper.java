package com.aaa.health.mapper.oldpeo;

import com.aaa.health.entity.admin.SysUser;
import com.aaa.health.entity.oldpeo.Oldarrange;
import com.aaa.health.entity.oldpeo.Oldpeo;
import com.aaa.health.entity.oldpeo.Oldtcm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface OldPeopleMapper {
    //添加
    int add(Oldpeo oldpeo);
    public int delete(String ids);
    List<Map> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    // 查询所有用户
    List<Map> queryAllUser(Map map);
    //用户总条数
    Integer queryUserTotal(Map map);
    //根据用户ID来查询用户
    Map<String,Object> queryUserById(Integer uid);
    //根据用户ID来查询用户
    List<Map> queryAll(Map map);
    //修改之前的查询
    List<Oldpeo> queryId();
    //修改结案
    int edit(Oldpeo oldpeo);
    //添加随访
    int addSui(Oldarrange oldarrange);
    //查询随访记录根据用户
    List<Map> queryArrange(int oldpeoId);
    //删除随访记录
    public int deleteArr(String ids);
    //查询医生
    List<Map> queryDoctor(Map<String, Object> queryMap);
//修改随访之前的查询
    List<Oldarrange> queryArr(int oldarrangeId);
    int updateArr(Oldarrange oldarrange);
}
