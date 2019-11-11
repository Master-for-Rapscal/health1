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
    List<DisfollowUp> findId(Integer infdisId);
    List<DisfollowUp> findById(Integer disfopId);
    List<DisfollowUp> findUserId(Integer infdisId);
    int update(DisfollowUp disfollowUp);
    //添加
    int add(DisfollowUp disfollowUp);
    int getTotal(Integer queryMap);
}
