package com.aaa.health.service.othslow;

import com.aaa.health.mapper.oldpeo.OldPeopleMapper;
import com.aaa.health.mapper.othslow.OthSlowMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class OthSlowServiceImpl implements OthSlowService {


    @Resource
    private OthSlowMapper othSlowMapper;
    @Override
    public int delete(String ids) {
        return othSlowMapper.delete(ids);
    }

    @Override
    public List<Map> findList(Map<String, Object> queryMap) {
        return othSlowMapper.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return othSlowMapper.getTotal(queryMap);
    }
}
