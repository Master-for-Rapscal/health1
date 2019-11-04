package com.aaa.health.service.Children;

import com.aaa.health.entity.Children.ChildTCM;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface ChildTCMService {
    int delete(String chmedmreId);

    //添加
    List<ChildTCM> findList(Map<String, Object> queryMap);

    int getTotal(Map<String, Object> queryMap);
    //随访次数
    Integer queryCount(Integer rid);
}
