package com.aaa.health.service.othslow;

import com.aaa.health.entity.zzh.Healthcheck;
import com.aaa.health.mapper.othslow.OthTNFMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class OthTNFServiceImpl implements OthTNFService {
    @Resource
    private OthTNFMapper othTNFMapper;
    @Override
    public List<Map> findList(Map<String, Object> queryMap) {
        return othTNFMapper.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return othTNFMapper.getTotal(queryMap);
    }

    @Override
    public List<Map> findList2(Map<String, Object> queryMap) {
        return othTNFMapper.findList2(queryMap);
    }

    @Override
    public int getTotal2(Map<String, Object> queryMap) {
        return othTNFMapper.getTotal2(queryMap);
    }

    @Override
    public int delete(String ids) {
        return othTNFMapper.delete(ids);
    }

    @Override
    public int add(Healthcheck userinfo) {
        return othTNFMapper.add(userinfo);
    }

    @Override
    public int edit(Healthcheck userinfo) {
        return othTNFMapper.edit(userinfo);
    }

    @Override
    public Healthcheck findById(Long id) {
        return othTNFMapper.findById(id);
    }
}
