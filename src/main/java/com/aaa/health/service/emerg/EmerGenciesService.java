package com.aaa.health.service.emerg;

import com.aaa.health.entity.area.Area;
import com.aaa.health.entity.emerg.EmerGencies;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public interface EmerGenciesService {
    List<EmerGencies> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    int add(EmerGencies emerGencies);
    int update(EmerGencies emerGencies);
    int delete(String ids);
    List<Area> findArea();
}
