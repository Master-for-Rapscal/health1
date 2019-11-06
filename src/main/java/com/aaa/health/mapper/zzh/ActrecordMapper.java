package com.aaa.health.mapper.zzh;

import com.aaa.health.entity.zzh.Actrecord;
import com.aaa.health.entity.zzh.Caahep;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ActrecordMapper {

    List<Actrecord> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    int delete(String ids);
    int add(Actrecord actrecord);
    int edit(Actrecord actrecord);
    Actrecord findById(Long id);
}
