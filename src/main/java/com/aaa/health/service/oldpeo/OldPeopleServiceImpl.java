package com.aaa.health.service.oldpeo;

import com.aaa.health.entity.admin.SysUser;
import com.aaa.health.entity.oldpeo.Oldpeo;
import com.aaa.health.mapper.oldpeo.OldPeopleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class OldPeopleServiceImpl implements OldPeopleService{
    @Resource
    private OldPeopleMapper oldPeopleMapper;


    @Override
    public int delete(String ids) {
        return oldPeopleMapper.delete(ids);
    }


    @Override
    public List<Map> findList(Map<String, Object> queryMap) {
        return oldPeopleMapper.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return oldPeopleMapper.getTotal(queryMap);
    }

    @Override
    public List<Map> queryAllUser(Map map) {
        return oldPeopleMapper.queryAllUser(map);
    }

    @Override
    public Integer queryUserTotal(Map map) {
        return oldPeopleMapper.queryUserTotal(map);
    }
}
