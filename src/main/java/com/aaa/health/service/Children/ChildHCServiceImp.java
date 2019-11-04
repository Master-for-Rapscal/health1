package com.aaa.health.service.Children;

import com.aaa.health.mapper.Children.ChildHC;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;
@Service
public class ChildHCServiceImp implements ChildHCService{
    @Resource
    private ChildHC c;
    @Override
    public int getTotal(Map<String, Object> queryMap, int recordId) {
        return c.getTotal(queryMap,recordId);
    }

    @Override
    public Integer queryCount(Integer rid) {
        return c.queryCount(rid);
    }
}
