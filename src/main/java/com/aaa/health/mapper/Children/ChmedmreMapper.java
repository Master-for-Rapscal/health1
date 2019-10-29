package com.aaa.health.mapper.Children;

import com.aaa.health.entity.Children.Chmedmre;
import com.aaa.health.entity.admin.Menu;
import com.aaa.health.entity.admin.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ChmedmreMapper {

    int delete(String RECORD_ID);

    //添加
    List<Chmedmre> findList(Map<String, Object> queryMap);

    int getTotal(Map<String, Object> queryMap);


}
