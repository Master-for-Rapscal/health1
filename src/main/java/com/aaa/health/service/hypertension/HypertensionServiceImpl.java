package com.aaa.health.service.hypertension;

import com.aaa.health.mapper.hypertension.HypertensionMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class HypertensionServiceImpl implements HypertensionService {
    @Resource
    private HypertensionMapper hypertensionMapper;
    @Override
    public List<Map> queryAll(Map map) {
        return hypertensionMapper.queryAll(map);
    }

    @Override
    public int queryTotal(Map map) {
        return hypertensionMapper.queryTotal(map);
    }

    @Override
    public int deleteById(String hid) {
        return hypertensionMapper.deleteById(hid);
    }

    @Override
    public List<Map> queryAllUser(Map map) {
        return hypertensionMapper.queryAllUser(map);
    }

    @Override
    public Integer queryUserTotal(Map map) {
        return hypertensionMapper.queryUserTotal(map);
    }
}
