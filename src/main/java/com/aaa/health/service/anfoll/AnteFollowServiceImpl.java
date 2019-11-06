package com.aaa.health.service.anfoll;

import com.aaa.health.entity.anfoll.AnteFollow;
import com.aaa.health.entity.zzh.Userinfo;
import com.aaa.health.mapper.anfoll.AnteFollowMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class AnteFollowServiceImpl implements AnteFollowService{
    @Resource
    private AnteFollowMapper anteFollowMapper;


    @Override
    public List<Userinfo> findList(Map<String, Object> queryMap) {
        return anteFollowMapper.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return anteFollowMapper.getTotal(queryMap);
    }

    @Override
    public int add(Userinfo userinfo) {
        return anteFollowMapper.add(userinfo);
    }

    @Override
    public int update(Userinfo userinfo) {
        return anteFollowMapper.update(userinfo);
    }

    @Override
    public int delete(String ids) {
        return anteFollowMapper.delete(ids);
    }
}

