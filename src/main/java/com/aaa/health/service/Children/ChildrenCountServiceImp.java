package com.aaa.health.service.Children;

import com.aaa.health.entity.Children.ChildInfo;
import com.aaa.health.mapper.Children.ChildrenCount;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class ChildrenCountServiceImp implements ChildrenCountService {

    @Resource
    private ChildrenCount childrenCount;

    @Override
    public List<ChildInfo> findList(Map<String, Object> queryMap) {
        return childrenCount.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return childrenCount.getTotal(queryMap);
    }


}
