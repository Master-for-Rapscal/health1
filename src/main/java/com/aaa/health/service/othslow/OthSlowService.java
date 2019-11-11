package com.aaa.health.service.othslow;

import com.aaa.health.entity.oldpeo.Oldarrange;
import com.aaa.health.entity.othslow.Othslow;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public interface OthSlowService {
    public int delete(String ids);
    public List<Map> findList(Map<String, Object> queryMap);
    public int getTotal(Map<String, Object> queryMap);
    //添加
    int add(Othslow othslow);
    //查询医生
    List<Map> queryDoctor();
    // 查询所有用户
    List<Map> queryAllUser(Map map);
    //用户总条数
    Integer queryUserTotal(Map map);
    //查询所有慢病
    List<Map> queryName();
    Map<String,Object> queryUserById(Integer uid);
    //修改之前查询
    Map<String,Object>  queryEdit(int othslowId);
    //修改
    int edit(Othslow othslow);
    //修改结案
    int upState(Othslow othslow);
    //查询慢病
    List<Map> queryDis();
}
