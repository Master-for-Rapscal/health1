package com.aaa.health.mapper.oldpeo;

import com.aaa.health.entity.oldpeo.Oldtcm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface OldtcmMapper {
    int add(Oldtcm oldtcm);
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

    List<Oldtcm> queryId(int oldtcmId);
    //修改结案
    int edit(Oldtcm oldtcm);
//查询医生
List<Map> queryDoctor();
List<Map> queryDoctor2(Map<String, Object> queryMap);
}
