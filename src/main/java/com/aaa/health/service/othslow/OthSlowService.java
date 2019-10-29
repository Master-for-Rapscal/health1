package com.aaa.health.service.othslow;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public interface OthSlowService {
    public int delete(String ids);
    public List<Map> findList(Map<String, Object> queryMap);
    public int getTotal(Map<String, Object> queryMap);
}
