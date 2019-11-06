package com.aaa.health.service.othslow;

import com.aaa.health.entity.othslow.Othslow;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface OthMECService {
    List<Map> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
}
