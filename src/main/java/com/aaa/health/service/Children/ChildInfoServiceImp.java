package com.aaa.health.service.Children;

import com.aaa.health.entity.Children.ChildInfo;
import com.aaa.health.mapper.Children.ChildInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class ChildInfoServiceImp implements ChildInfoService{
    @Resource
    private ChildInfoMapper cm;

    @Override
    public int delete(String addnewbornId) {
        return cm.delete(addnewbornId);
    }

    @Override
    public List<ChildInfo> findList(Map<String, Object> queryMap) {
        return cm.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return cm.getTotal(queryMap);
    }

    @Override
    public Integer queryCount(Integer rid) {
        return cm.queryCount(rid);
    }
}
