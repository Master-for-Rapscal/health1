package com.aaa.health.service.Children;

import com.aaa.health.entity.Children.ChildInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface ChildInfoService {
    int delete(String USER_ID);

    //添加
    List<ChildInfo> findList(Map<String, Object> queryMap);

    int getTotal(Map<String, Object> queryMap);

    Integer queryCount(Integer rid);
}
