package com.aaa.health.mapper.Children;

import com.aaa.health.entity.Children.ChildInfo;

import java.util.List;
import java.util.Map;

public interface ChildrenCount {

    List<ChildInfo> findList(Map<String, Object> queryMap);

    int getTotal(Map<String, Object> queryMap);
    //随访次数
    Integer queryCount(Integer rid);
}
