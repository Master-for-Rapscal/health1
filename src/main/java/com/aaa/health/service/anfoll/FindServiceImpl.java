package com.aaa.health.service.anfoll;

import com.aaa.health.entity.anfoll.AnteFollow;
import com.aaa.health.mapper.anfoll.FindMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class FindServiceImpl implements FindService{
    @Resource
    private FindMapper findMapper;
    @Override
    public int delete(String anfoId) {
        return findMapper.delete(anfoId);
    }

    @Override
    public List<AnteFollow> findList(Map<String, Object> queryMap) {
        return findMapper.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return findMapper.getTotal(queryMap);
    }
}
