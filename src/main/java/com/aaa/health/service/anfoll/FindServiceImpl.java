package com.aaa.health.service.anfoll;

import com.aaa.health.entity.anfoll.AnteFollow;
import com.aaa.health.mapper.anfoll.FindMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class FindServiceImpl implements FindService {
    @Resource
    private FindMapper findMapper;

    @Override
    public int delete(String ids) {
        return findMapper.delete(ids);
    }

    @Override
    public Map<String, Object> findUser(Integer userId) {
        return findMapper.findUser(userId);
    }


    @Override
    public List<AnteFollow> findAnfoll(Integer userId) {
        return findMapper.findAnfoll(userId);
    }

    @Override
    public int add(AnteFollow anteFollow) {
        return findMapper.add(anteFollow);
    }

    @Override
    public Map<String, Object> findById(Integer anfoId) {
        return findMapper.findById(anfoId);
    }

    @Override
    public int update(AnteFollow anteFollow) {
        return findMapper.update(anteFollow);
    }

    @Override
    public int getTotal(Integer userId) {
        return findMapper.getTotal(userId);
    }
}