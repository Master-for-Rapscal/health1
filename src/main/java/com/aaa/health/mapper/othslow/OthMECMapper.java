
package com.aaa.health.mapper.othslow;

import com.aaa.health.entity.othslow.Othslow;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface OthMECMapper {

    List<Map> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);

}


