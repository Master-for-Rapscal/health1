package com.aaa.health.service.pultub;

import com.aaa.health.entity.pultub.PulTubfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public interface PulTubfoService {
    List<PulTubfo> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    int add(PulTubfo pulTubfo);
    int update(PulTubfo pulTubfo);
    int delete(String ids);
}
