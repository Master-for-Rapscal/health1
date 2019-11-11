package com.aaa.health.service.othslow;

import com.aaa.health.entity.zzh.Healthcheck;
import com.aaa.health.mapper.othslow.OthMECMapper;
import com.aaa.health.mapper.othslow.OthSlowMapper;
import com.aaa.health.service.zzh.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class OthMECServiceImpl implements OthMECService {
    @Autowired
    public UserinfoService userinfoService;
    @Resource
    private OthMECMapper othMECMapper;
    @Override
    public List<Map> findList(Map<String, Object> queryMap) {
        return othMECMapper.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return othMECMapper.getTotal(queryMap);
    }

    @Override
    public List<Map> findList2(Map<String, Object> queryMap) {
        return othMECMapper.findList2(queryMap);
    }

    @Override
    public int getTotal2(Map<String, Object> queryMap) {
        return othMECMapper.getTotal2(queryMap);
    }

    @Override
    public int delete(String ids) {
        return othMECMapper.delete(ids);
    }

    @Override
    public int add(Healthcheck userinfo) {
        return othMECMapper.add(userinfo);
    }

    @Override
    public int edit(Healthcheck userinfo) {
        return othMECMapper.edit(userinfo);
    }

    @Override
    public Healthcheck findById(Long id) {
        return othMECMapper.findById(id);
    }
}
