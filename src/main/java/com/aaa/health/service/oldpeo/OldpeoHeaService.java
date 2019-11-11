package com.aaa.health.service.oldpeo;

import com.aaa.health.entity.zzh.Healthcheck;
import org.springframework.stereotype.Service;
import com.aaa.health.entity.zzh.Healthcheck;

import java.util.List;
import java.util.Map;

@Service
public interface OldpeoHeaService {
    public List<Map> findList(Map<String, Object> queryMap);
    public int getTotal(Map<String, Object> queryMap);
    int delete(String ids);
    int add(Healthcheck userinfo);
    int edit(Healthcheck userinfo);
    Healthcheck findById(Long id);
}
