
package com.aaa.health.mapper.othslow;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface OthTNFMapper {

    List<Map> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);

}


