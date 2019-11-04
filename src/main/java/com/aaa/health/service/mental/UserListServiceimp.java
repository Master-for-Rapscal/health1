package com.aaa.health.service.mental;

import com.aaa.health.entity.mental.mentalMessage;
import com.aaa.health.mapper.mental.UserListMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class UserListServiceimp implements UserListService{
    @Resource
    private UserListMapper u;

    @Override
    public int add(mentalMessage mentalMessage) {
        return u.add(mentalMessage);
    }

    @Override
    public int edit(mentalMessage mentalMessage) {
        return u.edit(mentalMessage);
    }

    @Override
    public List<mentalMessage> findBymentalMessage(Long followRecordsid) {
        return u.findBymentalMessage(followRecordsid);
    }

    @Override
    public List<mentalMessage> findList(Map<String, Object> queryMap) {
        return u.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return u.getTotal(queryMap);
    }
}
