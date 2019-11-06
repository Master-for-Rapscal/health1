package com.aaa.health.service.oldpeo;

import com.aaa.health.entity.oldpeo.Oldtcm;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public interface OldtcmService {
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
}
