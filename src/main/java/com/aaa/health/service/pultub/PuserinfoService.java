package com.aaa.health.service.pultub;

import com.aaa.health.entity.pultub.Puserinfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public interface PuserinfoService {
    List<Puserinfo> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    //List<Puserinfo> findUser(Map<String, Object> queryMap);
    //根据用户ID来查询用户
    Map<String,Object> queryUserById(Integer userId);
}
