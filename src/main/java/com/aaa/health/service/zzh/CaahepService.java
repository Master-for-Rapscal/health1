package com.aaa.health.service.zzh;

import com.aaa.health.entity.zzh.Caahep;
import com.aaa.health.entity.zzh.Healthcheck;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface CaahepService {
    List<Caahep> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    int delete(String ids);
    int add(Caahep caahep);
    int edit(Caahep caahep);
    Caahep findById(Long id);
}
