package com.aaa.health.service.indis;

import com.aaa.health.entity.indis.InfDisease;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface InfDiseaseService {
    List<Map> queryDoctor();
    List<InfDisease> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    int add(InfDisease infDisease);
    int update(InfDisease infDisease);
    int delete(String ids);
}
