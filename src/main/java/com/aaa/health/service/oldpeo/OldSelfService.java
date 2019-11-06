package com.aaa.health.service.oldpeo;


import com.aaa.health.entity.oldpeo.Oldself;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface OldSelfService {
    //添加自理评估记录
    int add(Oldself oldself);
   // 删除自理评估记录
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
 //模糊查询
 List<Map> queryLike(Map map);

    List<Oldself> queryId(int oldselfId);
    //修改資歷评估
    int edit(Oldself oldself);

}
