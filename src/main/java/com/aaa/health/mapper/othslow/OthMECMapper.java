
package com.aaa.health.mapper.othslow;

import com.aaa.health.entity.othslow.Othslow;
import com.aaa.health.entity.zzh.Healthcheck;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface OthMECMapper {

    List<Map> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    List<Map> findList2(Map<String, Object> queryMap);
    int getTotal2(Map<String, Object> queryMap);

    int delete(String ids);
    int add(Healthcheck userinfo);
    int edit(Healthcheck userinfo);
    Healthcheck findById(Long id);
}


