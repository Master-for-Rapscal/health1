package com.aaa.health.service.anfoll;

import com.aaa.health.entity.anfoll.AnteFollow;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public interface FindService {
    int delete(String anfoId);

    //添加
    List<AnteFollow> findList(Map<String, Object> queryMap);

    int getTotal(Map<String, Object> queryMap);
}
