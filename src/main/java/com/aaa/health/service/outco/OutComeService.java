package com.aaa.health.service.outco;

import com.aaa.health.entity.outco.OutCome;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public interface OutComeService {
    List<OutCome> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    int add(OutCome outCome);
    int update(OutCome outCome);
    int delete(String ids);
}
