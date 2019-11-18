package com.aaa.health.service.anfoll;

import com.aaa.health.entity.anfoll.AnteFollow;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public interface FindService {
    List<AnteFollow> findAnfoll(Integer userId);
    int add(AnteFollow anteFollow);
    Map<String,Object> findById(Integer anfoId);
    int update(AnteFollow anteFollow);
    int getTotal(Integer userId);
    int delete(String ids);
    Map<String,Object> findUser(Integer userId);
}
