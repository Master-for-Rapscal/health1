package com.aaa.health.service.othslow;

import com.aaa.health.entity.othslow.Othslow;
import com.aaa.health.mapper.oldpeo.OldPeopleMapper;
import com.aaa.health.mapper.othslow.OthSlowMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class OthSlowServiceImpl implements OthSlowService{


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

    @Override
    public int add(Othslow othslow) {
        return othSlowMapper.add(othslow);
    }

    @Override
    public List<Map> queryDoctor(Map<String, Object> queryMap) {
        return othSlowMapper.queryDoctor(queryMap);
    }

    @Override
    public List<Map> queryAllUser(Map map) {
        return othSlowMapper.queryAllUser(map);
    }

    @Override
    public Integer queryUserTotal(Map map) {
        return othSlowMapper.queryUserTotal(map);
    }

    @Override
    public List<Map> queryName() {
        return othSlowMapper.queryName();
    }

    @Override
    public Map<String, Object> queryUserById(Integer uid) {
        return othSlowMapper.queryUserById(uid);
    }

    @Override
    public   Map<String,Object>   queryEdit(int othslowId) {
        return othSlowMapper.queryEdit(othslowId);
    }

    @Override
    public int edit(Othslow othslow) {
        return othSlowMapper.edit(othslow);
    }

    @Override
    public int upState(Othslow othslow) {
        return othSlowMapper.upState(othslow);
    }

    @Override
    public List<Map> queryDis() {
        return othSlowMapper.queryDis();
    }
}
