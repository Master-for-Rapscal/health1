package com.aaa.health.service.othslow;

import com.aaa.health.entity.othslow.Othslow;
import com.aaa.health.entity.zzh.Healthcheck;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface OthMECService {
    List<Map> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    List<Map> findList2(Map<String, Object> queryMap);
    int getTotal2(Map<String, Object> queryMap);
    int delete(String ids);
    int add(Healthcheck userinfo);
    int edit(Healthcheck userinfo);
    Healthcheck findById(Long id);
}
