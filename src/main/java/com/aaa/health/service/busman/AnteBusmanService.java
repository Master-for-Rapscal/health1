package com.aaa.health.service.busman;

import com.aaa.health.entity.anfoll.AnteFollow;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public interface AnteBusmanService {
    List<AnteFollow> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    int update(AnteFollow anteFollow);
}
