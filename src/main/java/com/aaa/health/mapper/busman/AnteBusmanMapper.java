package com.aaa.health.mapper.busman;


import com.aaa.health.entity.anfoll.AnteFollow;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface AnteBusmanMapper {
    List<AnteFollow> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    int update(AnteFollow anteFollow);
}