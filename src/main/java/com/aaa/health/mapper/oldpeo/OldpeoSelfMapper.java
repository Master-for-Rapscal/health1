package com.aaa.health.mapper.oldpeo;

import com.aaa.health.entity.oldpeo.Oldpeo;
import com.aaa.health.entity.oldpeo.Oldself;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface OldpeoSelfMapper {

    int add(Oldself oldself);
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

    List<Oldself> queryId(int oldselfId);
    //修改结案
    int edit(Oldself oldself);
    //模糊查询
    List<Map> queryLike(Map map);

    List<Oldself>  queryDine(int oldselfId );

}
