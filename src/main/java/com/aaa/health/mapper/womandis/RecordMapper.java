package com.aaa.health.mapper.womandis;

import com.aaa.health.entity.Children.ChildInfo;
import com.aaa.health.entity.womandis.Record;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface RecordMapper {
    int delete(String wodisId);

    //添加
    List<Record> findList(Integer userId);
    int getTotal(Map<String, Object> queryMap);


}
