package com.aaa.health.mapper.anfoll;

import com.aaa.health.entity.anfoll.AnteFollow;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface FindMapper {
    int delete(String anfoId);

    //添加
    List<AnteFollow> findList(Map<String, Object> queryMap);

    int getTotal(Map<String, Object> queryMap);
}
