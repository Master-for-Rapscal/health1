package com.aaa.health.service.hostpit;

import com.aaa.health.entity.zzh.Healthcheck;
import com.aaa.health.entity.zzh.Userinfo;
import com.aaa.health.mapper.hostpit.HostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class HostServiceImpl implements HostService {
    @Autowired
    private HostMapper hostMapper;

    @Override
    public List<Map<String, Object>> queryArea() {
        return hostMapper.queryArea();
    }

    @Override
    public Integer addUserInfo(Userinfo userinfo) {
        return hostMapper.addUserInfo(userinfo);
    }

    @Override
    public List<Healthcheck> queryCheck(Map<String, Object> map) {
        return hostMapper.queryCheck(map);
    }

    @Override
    public Integer addUserNPI(Map map) {
        return hostMapper.addUserNPI(map);
    }
}
