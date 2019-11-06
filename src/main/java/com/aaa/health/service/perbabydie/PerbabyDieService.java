package com.aaa.health.service.perbabydie;

import com.aaa.health.entity.perbabyDie.PerbabyDie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public interface PerbabyDieService {
    List<PerbabyDie> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
}
