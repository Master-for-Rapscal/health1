package com.aaa.health.service.mental;

import com.aaa.health.entity.mental.mentalMessage;
import com.aaa.health.mapper.mental.MetalMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class MetalServiceImp implements MetalService{
    @Resource
    private MetalMapper mm;

    @Override
    public int delete(String USER_ID) {
        return mm.delete(USER_ID);
    }

    @Override
    public List<mentalMessage> findList(Map<String, Object> queryMap) {
        return mm.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return mm.getTotal(queryMap);
    }
}
