package com.aaa.health.mapper.mental;


import com.aaa.health.entity.mental.mentalMessage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface MetalMapper {
    int delete(String USER_ID);




    List<mentalMessage> findList(Map<String, Object> queryMap);

    int getTotal(Map<String, Object> queryMap);
}
