package com.aaa.health.mapper.pultub;

import com.aaa.health.entity.pultub.FoservPul;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface FoservPulMapper {
    int delete(String foserId);
    List<FoservPul> findId(Integer pultubfoId);
    int getTotal(Map<String, Object> queryMap);
    Map<String,Object> findById(Integer foserId);
}
