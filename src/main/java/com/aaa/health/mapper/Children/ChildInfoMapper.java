package com.aaa.health.mapper.Children;

import com.aaa.health.entity.Children.ChildInfo;

import com.aaa.health.entity.Children.Childinsrecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface ChildInfoMapper {
    int delete(String USER_ID);

    //添加
    List<ChildInfo> findList(Map<String, Object> queryMap);

    int getTotal(Map<String, Object> queryMap);
    //随访次数
    Integer queryCount(Integer rid);


}
