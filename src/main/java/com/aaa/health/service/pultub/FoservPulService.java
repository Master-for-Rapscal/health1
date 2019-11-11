package com.aaa.health.service.pultub;

import com.aaa.health.entity.pultub.FoservPul;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public interface FoservPulService {
    int delete(String foserId);
    List<FoservPul> findId(Integer pultubfoId);
    int getTotal(Map<String, Object> queryMap);
    Map<String,Object> findById(Integer foserId);
    List<FoservPul> findUserId(Integer pultubfoId);
    int add(FoservPul foservPul);
    int update(FoservPul foservPul);
}
