package com.aaa.health.mapper.Children;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface ChildHC {
    int getTotal(Map<String, Object> queryMap,int recordId);
    //随访次数
    Integer queryCount(Integer rid);

}
