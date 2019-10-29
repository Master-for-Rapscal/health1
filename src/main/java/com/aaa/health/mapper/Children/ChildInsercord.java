package com.aaa.health.mapper.Children;


import com.aaa.health.entity.Children.Childinsrecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface ChildInsercord {
    int delete(String insrecordId);

    //添加
    List<Childinsrecord> findList(Map<String, Object> queryMap);

    int getTotal(Map<String, Object> queryMap);
}
