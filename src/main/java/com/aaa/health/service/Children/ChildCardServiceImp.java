package com.aaa.health.service.Children;

import com.aaa.health.entity.Children.ChildInfo;
import com.aaa.health.mapper.Children.ChildCardMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class ChildCardServiceImp implements ChildCardService{
    @Resource
    private ChildCardMapper cm;

    @Override
    public List<ChildInfo> findList(Map<String, Object> queryMap) {
        return cm.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return cm.getTotal(queryMap);
    }

    @Override
    public int add(ChildInfo childInfo) {
        return cm.add(childInfo);
    }

    @Override
    public int edit(ChildInfo childInfo) {
        return cm.edit(childInfo);
    }

    @Override
    public List<ChildInfo> findByChildCard(Long addnewbornId) {
        return cm.findByChildCard(addnewbornId);
    }
}
