package com.aaa.health.service.anfoll;

import com.aaa.health.entity.anfoll.AnteFollow;
import com.aaa.health.entity.zzh.Userinfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public interface AnteFollowService {
    List<Userinfo> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    int add(Userinfo userinfo);
    int update(Userinfo userinfo);
    int delete(String ids);
}
