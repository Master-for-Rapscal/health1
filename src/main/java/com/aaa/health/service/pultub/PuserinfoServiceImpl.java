package com.aaa.health.service.pultub;

import com.aaa.health.entity.pultub.Puserinfo;
import com.aaa.health.mapper.pultub.PuserinfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class PuserinfoServiceImpl implements PuserinfoService{
    @Resource
    private PuserinfoMapper puserinfoMapper;
    @Override
    public List<Puserinfo> findList(Map<String, Object> queryMap) {
        return puserinfoMapper.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return puserinfoMapper.getTotal(queryMap);
    }

   /* @Override
    public List<Puserinfo> findUser(Map<String, Object> queryMap) {
        return puserinfoMapper.findUser(queryMap);
    }*/

    @Override
    public Map<String, Object> queryUserById(Integer userId) {
        return puserinfoMapper.queryUserById(userId);
    }
}
