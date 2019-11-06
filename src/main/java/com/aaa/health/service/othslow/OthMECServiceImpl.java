package com.aaa.health.service.othslow;

import com.aaa.health.mapper.othslow.OthMECMapper;
import com.aaa.health.mapper.othslow.OthSlowMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class OthMECServiceImpl implements OthMECService {
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
}
