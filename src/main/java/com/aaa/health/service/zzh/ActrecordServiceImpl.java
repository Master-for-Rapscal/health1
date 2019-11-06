package com.aaa.health.service.zzh;

import com.aaa.health.entity.zzh.Actrecord;
import com.aaa.health.entity.zzh.Caahep;
import com.aaa.health.mapper.zzh.ActrecordMapper;
import com.aaa.health.mapper.zzh.CaahepMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ActrecordServiceImpl implements ActrecordService{
    @Autowired
    private ActrecordMapper actrecordMapper;


    @Override
    public List<Actrecord> findList(Map<String, Object> queryMap) {
        return actrecordMapper.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return actrecordMapper.getTotal(queryMap);
    }

    @Override
    public int delete(String ids) {
        return actrecordMapper.delete(ids);
    }

    @Override
    public int add(Actrecord actrecord) {
        return actrecordMapper.add(actrecord);
    }

    @Override
    public int edit(Actrecord actrecord) {
        return actrecordMapper.edit(actrecord);
    }

    @Override
    public Actrecord findById(Long id) {
        return actrecordMapper.findById(id);
    }
}
