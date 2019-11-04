package com.aaa.health.service.mental;

import com.aaa.health.entity.mental.mentalMessage;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface UserListService {
    //添加
    int add(mentalMessage mentalMessage);
    //修改
    int edit(mentalMessage mentalMessage);

    List<mentalMessage> findBymentalMessage(Long followRecordsid);
    //查询
    List<mentalMessage> findList(Map<String, Object> queryMap);

    int getTotal(Map<String, Object> queryMap);
}
