package com.aaa.health.service.Children;

import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public interface ChildHCService {
    int getTotal(Map<String, Object> queryMap, int recordId);
    //随访次数
    Integer queryCount(Integer rid);
}
