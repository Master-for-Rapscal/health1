package com.aaa.health.service.busman;

import com.aaa.health.entity.pultub.Puserinfo;
import com.aaa.health.mapper.busman.FindUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class FindUserServiceImpl implements FindUserService{
    @Resource
    private FindUserMapper findUserMapper;
    @Override
    public List<Puserinfo> findList(Map<String, Object> queryMap) {
        return findUserMapper.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return findUserMapper.getTotal(queryMap);
    }

    @Override
    public Map<String, Object> findUserId(Integer userId) {
        return findUserMapper.findUserId(userId);
    }
}
