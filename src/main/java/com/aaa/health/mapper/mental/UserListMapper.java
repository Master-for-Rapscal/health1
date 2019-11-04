package com.aaa.health.mapper.mental;

import com.aaa.health.entity.mental.mentalMessage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface UserListMapper {
    //添加
    int add(mentalMessage mentalMessage);
   //修改
    int edit(mentalMessage mentalMessage);

    List<mentalMessage> findBymentalMessage(Long followRecordsid);

    //查询
    List<mentalMessage> findList(Map<String, Object> queryMap);

    int getTotal(Map<String, Object> queryMap);
}
