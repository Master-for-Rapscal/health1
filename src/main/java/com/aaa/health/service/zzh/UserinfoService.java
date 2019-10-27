package com.aaa.health.service.zzh;

import com.aaa.health.entity.zzh.Userinfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface UserinfoService {
    List<Userinfo> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
}
