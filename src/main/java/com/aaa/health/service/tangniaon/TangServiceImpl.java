package com.aaa.health.service.tangniaon;

import com.aaa.health.mapper.tangniaon.TangMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class TangServiceImpl implements TangService {
    @Resource
    private TangMapper tangMapper;

    @Override
    public List<Map> queryAll(Map map) {
        return tangMapper.queryAll(map);
    }

    @Override
    public int queryTotal(Map map) {
        return tangMapper.queryTotal(map);
    }

    @Override
    public int deleteById(String ids) {
        return tangMapper.deleteById(ids);
    }

    @Override
    public List<Map> queryAllUser(Map map) {
        return tangMapper.queryAllUser(map);
    }

    @Override
    public Integer queryUserTotal(Map map) {
        return tangMapper.queryUserTotal(map);
    }

    @Override
    public Map<String, Object> queryUserById(Integer uid) {
        return tangMapper.queryUserById(uid);
    }
}
