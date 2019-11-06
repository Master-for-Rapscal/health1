package com.aaa.health.mapper.indis;

import com.aaa.health.entity.indis.DisfollowUp;
import com.aaa.health.entity.indis.InfDisease;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface DisfollowUpMapper {
    List<Map> queryDoctor();
    int delete(String disfopId);
    //添加
    List<DisfollowUp> findId(Integer infdisId);
    List<DisfollowUp> findById(Integer disfopId);
    int edit(DisfollowUp disfollowUp);
    int add(DisfollowUp disfollowUp);
    int getTotal(Map<String, Object> queryMap);
}
