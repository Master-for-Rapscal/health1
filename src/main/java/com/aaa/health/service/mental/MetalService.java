package com.aaa.health.service.mental;

import com.aaa.health.entity.mental.mentalMessage;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface MetalService {
    int delete(String USER_ID);

    //添加
    List<mentalMessage> findList(Map<String, Object> queryMap);

    int getTotal(Map<String, Object> queryMap);
}
