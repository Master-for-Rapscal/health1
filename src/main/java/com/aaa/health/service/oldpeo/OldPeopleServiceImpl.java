package com.aaa.health.service.oldpeo;

import com.aaa.health.entity.admin.SysUser;
import com.aaa.health.entity.oldpeo.Oldarrange;
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
    public int add(Oldpeo oldpeo) {
        return oldPeopleMapper.add(oldpeo);
    }

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

    @Override
    public Map<String, Object> queryUserById(Integer uid) {
        return oldPeopleMapper.queryUserById(uid);
    }

    @Override
    public List<Map> queryAll(Map map) {
        return oldPeopleMapper.queryAll(map);
    }

    @Override
    public int edit(Oldpeo oldpeo) {
        return oldPeopleMapper.edit(oldpeo);
    }

    @Override
    public List<Oldpeo> queryId() {
        return oldPeopleMapper.queryId();
    }

    @Override
    public List<Map> queryArrange(int oldpeoId) {
        return oldPeopleMapper.queryArrange(oldpeoId);
    }

    @Override
    public int addSui(Oldarrange oldarrange) {
        return oldPeopleMapper.addSui(oldarrange);
    }

    @Override
    public int deleteArr(String ids) {
        return oldPeopleMapper.deleteArr(ids);
    }

    @Override
    public List<Map> queryDoctor() {
        return oldPeopleMapper.queryDoctor();
    }

    @Override
    public List<Oldarrange> queryArr(int oldarrangeId) {
        return oldPeopleMapper.queryArr(oldarrangeId);
    }

    @Override
    public int updateArr(Oldarrange oldarrange) {
        return oldPeopleMapper.updateArr(oldarrange);
    }
}
