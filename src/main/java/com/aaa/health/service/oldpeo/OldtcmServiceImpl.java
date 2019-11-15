package com.aaa.health.service.oldpeo;

import com.aaa.health.entity.oldpeo.Oldtcm;
import com.aaa.health.mapper.oldpeo.OldpeoSelfMapper;
import com.aaa.health.mapper.oldpeo.OldtcmMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class OldtcmServiceImpl implements OldtcmService {

    @Resource
    private OldtcmMapper oldtcmMapper;
    @Override
    public int add(Oldtcm oldtcm) {
        return oldtcmMapper.add(oldtcm);
    }

    @Override
    public int delete(String ids) {
        return oldtcmMapper.delete(ids);
    }

    @Override
    public List<Map> findList(Map<String, Object> queryMap) {
        return oldtcmMapper.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return oldtcmMapper.getTotal(queryMap);
    }

    @Override
    public List<Map> queryAllUser(Map map) {
        return oldtcmMapper.queryAllUser(map);
    }

    @Override
    public Integer queryUserTotal(Map map) {
        return oldtcmMapper.queryUserTotal(map);
    }

    @Override
    public Map<String, Object> queryUserById(Integer uid) {
        return oldtcmMapper.queryUserById(uid);
    }

    @Override
    public List<Map> queryAll(Map map) {
        return oldtcmMapper.queryAll(map);
    }

    @Override
    public List<Oldtcm> queryId(int oldtcmId) {
        return oldtcmMapper.queryId(oldtcmId);
    }

    @Override
    public int edit(Oldtcm oldtcm) {
        return oldtcmMapper.edit(oldtcm);
    }

    @Override
    public List<Map> queryDoctor() {
        return oldtcmMapper.queryDoctor();
    }

    @Override
    public List<Map> queryDoctor2(Map<String, Object> queryMap) {
        return oldtcmMapper.queryDoctor2(queryMap);
    }
}
