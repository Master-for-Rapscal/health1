package com.aaa.health.service.perbabydie;

import com.aaa.health.entity.perbabyDie.PerbabyDie;
import com.aaa.health.mapper.perbabydie.PerbabyDieMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class PerbabyDieServiceImpl implements PerbabyDieService{
    @Resource
    private PerbabyDieMapper perbabyDieMapper;
    @Override
    public List<PerbabyDie> findList(Map<String, Object> queryMap) {
        return perbabyDieMapper.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return perbabyDieMapper.getTotal(queryMap);
    }
}
