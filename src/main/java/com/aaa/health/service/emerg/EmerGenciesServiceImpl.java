package com.aaa.health.service.emerg;

import com.aaa.health.entity.area.Area;
import com.aaa.health.entity.emerg.EmerGencies;
import com.aaa.health.mapper.emerg.EmerGenciesMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class EmerGenciesServiceImpl implements EmerGenciesService{
    @Resource
    private EmerGenciesMapper emerGenciesMapper;
    @Override
    public List<EmerGencies> findList(Map<String, Object> queryMap) {
        return emerGenciesMapper.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return emerGenciesMapper.getTotal(queryMap);
    }

    @Override
    public int add(EmerGencies emerGencies) {
        return emerGenciesMapper.add(emerGencies);
    }

    @Override
    public Map<String, Object> findById(Integer emgId) {
        return emerGenciesMapper.findById(emgId);
    }

    @Override
    public int update(EmerGencies emerGencies) {
        return emerGenciesMapper.update(emerGencies);
    }

    @Override
    public int delete(String ids) {
        return emerGenciesMapper.delete(ids);
    }

    @Override
    public List<Area> findArea() {
        return emerGenciesMapper.findArea();
    }
}
