package com.aaa.health.service.womandis;

import com.aaa.health.entity.womandis.WomanDisease;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public interface WomanDiseaseService {
    List<WomanDisease> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    int add(WomanDisease womanDisease);
    int update(WomanDisease womanDisease);
    int delete(String ids);
    //List<WomanDisease> queryRe(Integer wodisId);
}
