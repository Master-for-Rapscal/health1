package com.aaa.health.mapper.pultub;

import com.aaa.health.entity.pultub.PulTubfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface PulTubfoMapper {
    List<PulTubfo> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    int add(PulTubfo pulTubfo);
    Map<String,Object> findById(Integer pultubfoId);
    int edit(PulTubfo pulTubfo);
    int delete(String ids);
}
