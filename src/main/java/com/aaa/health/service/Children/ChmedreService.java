package com.aaa.health.service.Children;

import com.aaa.health.entity.Children.Chmedmre;
import com.aaa.health.mapper.Children.ChmedmreMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface ChmedreService {
    int delete(String RECORD_ID);
    List<Chmedmre> findList(Map<String, Object> queryMap);

    int getTotal(Map<String, Object> queryMap);
}

