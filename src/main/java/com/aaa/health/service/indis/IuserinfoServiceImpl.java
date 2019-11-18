package com.aaa.health.service.indis;

import com.aaa.health.entity.pultub.Puserinfo;
import com.aaa.health.mapper.indis.IuserinfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class IuserinfoServiceImpl implements IuserinfoService{
    @Resource
    private IuserinfoMapper iuserinfoMapper;
    @Override
    public List<Puserinfo> findList(Map<String, Object> queryMap) {
        return iuserinfoMapper.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return iuserinfoMapper.getTotal(queryMap);
    }

    @Override
    public Map<String, Object> queryUserById(Integer userId) {
        return iuserinfoMapper.queryUserById(userId);
    }
}
