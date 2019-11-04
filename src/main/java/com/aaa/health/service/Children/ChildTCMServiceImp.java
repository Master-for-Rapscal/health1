package com.aaa.health.service.Children;

import com.aaa.health.entity.Children.ChildTCM;
import com.aaa.health.mapper.Children.ChildTCMMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class ChildTCMServiceImp implements ChildTCMService{

    @Resource
    private ChildTCMMapper c;

    @Override
    public int delete(String chmedmreId) {
        return c.delete(chmedmreId);
    }

    @Override
    public List<ChildTCM> findList(Map<String, Object> queryMap) {
        return c.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return c.getTotal(queryMap);
    }

    @Override
    public Integer queryCount(Integer rid) {
        return c.queryCount(rid);
    }
}
