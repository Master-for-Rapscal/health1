package com.aaa.health.service.oldpeo;

import com.aaa.health.entity.oldpeo.Oldpeo;
import com.aaa.health.entity.oldpeo.Oldself;
import com.aaa.health.mapper.oldpeo.OldPeopleMapper;
import com.aaa.health.mapper.oldpeo.OldpeoSelfMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class OldSelfServiceImpl implements OldSelfService{
    @Resource
    private OldpeoSelfMapper oldpeoSelfMapper;


    @Override
    public int add(Oldself oldself) {
        return oldpeoSelfMapper.add(oldself);
    }

    @Override
    public int delete(String ids) {
        return oldpeoSelfMapper.delete(ids);
    }

    @Override
    public List<Map> findList(Map<String, Object> queryMap) {
        return oldpeoSelfMapper.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return oldpeoSelfMapper.getTotal(queryMap);
    }

    @Override
    public List<Map> queryAllUser(Map map) {
        return oldpeoSelfMapper.queryAllUser(map);
    }

    @Override
    public Integer queryUserTotal(Map map) {
        return oldpeoSelfMapper.queryUserTotal(map);
    }


    @Override
    public Map<String, Object> queryUserById(Integer uid) {
        return oldpeoSelfMapper.queryUserById(uid);
    }

    @Override
    public List<Map> queryAll(Map map) {
        return oldpeoSelfMapper.queryAll(map);
    }

    @Override
    public List<Map> queryLike(Map map) {
        return oldpeoSelfMapper.queryLike(map);
    }

    @Override
    public List<Oldself> queryId(int oldselfId) {
        return oldpeoSelfMapper.queryId(oldselfId);
    }

    @Override
    public int edit(Oldself oldself) {
        return oldpeoSelfMapper.edit(oldself);
    }
}
