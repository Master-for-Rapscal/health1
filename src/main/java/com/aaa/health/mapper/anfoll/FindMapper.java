package com.aaa.health.mapper.anfoll;

import com.aaa.health.entity.anfoll.AnteFollow;
import com.aaa.health.entity.pultub.FoservPul;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface FindMapper {
    List<AnteFollow> findAnfoll(Integer userId);
    int add(AnteFollow anteFollow);
    Map<String,Object> findById(Integer anfoId);
    int update(AnteFollow anteFollow);
    int getTotal(Integer userId);
    int delete(String ids);
    Map<String,Object> findUser(Integer userId);
}
