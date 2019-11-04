package com.aaa.health.service.zzh;

import com.aaa.health.entity.zzh.Healthcheck;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface HealthcheckService {
    List<Healthcheck> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    int delete(String ids);
    int add(Healthcheck userinfo);
    int edit(Healthcheck userinfo);

    Healthcheck findById(Long id);
}
