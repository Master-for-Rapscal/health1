package com.aaa.health.mapper.Children;

import com.aaa.health.entity.Children.ChildInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ChildCardMapper {

    //添加
    int add(ChildInfo childInfo);
    //修改
    Integer edit(ChildInfo childInfo);

    List<ChildInfo> findByChildCard(Long addnewbornId);


    List<ChildInfo> findList(Map<String, Object> queryMap);

    int getTotal(Map<String, Object> queryMap);

}
