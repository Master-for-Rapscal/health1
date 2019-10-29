package com.aaa.health.service.oldpeo;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface OldpeoCardService {

    public List<Map> findList(Map<String, Object> queryMap);

    public int getTotal(Map<String, Object> queryMap);
}

