package com.aaa.health.service.zzh;

import com.aaa.health.entity.zzh.Actrecord;
import com.aaa.health.entity.zzh.Caahep;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface ActrecordService {

    List<Actrecord> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    int delete(String ids);
    int add(Actrecord actrecord);
    int edit(Actrecord actrecord);
    Actrecord findById(Long id);
}
