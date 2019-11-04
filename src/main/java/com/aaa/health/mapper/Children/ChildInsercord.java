package com.aaa.health.mapper.Children;


import com.aaa.health.entity.Children.Childinsrecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface ChildInsercord {
    int delete(String insrecordId);


    List<Childinsrecord> findList(Integer recordId);

    int getTotal(Map<String, Object> queryMap);

    //修改
    int edit(Childinsrecord childinsrecord);
    List<ChildInsercord> findBymentalMessage(Long insrecordId);

    //添加
    int add(Childinsrecord childinsrecord);
}
