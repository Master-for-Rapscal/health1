package com.aaa.health.mapper.Children;

import com.aaa.health.entity.Children.ChildTCM;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ChildTCMMapper {
    int delete(String chmedmreId);

    //添加
    List<ChildTCM> findList(Map<String, Object> queryMap);

    int getTotal(Map<String, Object> queryMap);

    //随访次数
    Integer queryCount(Integer rid);
}
