package com.aaa.health.service.busman;

import com.aaa.health.entity.anfoll.AnteFollow;
import com.aaa.health.mapper.busman.AnteBusmanMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class AnteBusmanServiceImpl implements AnteBusmanService {
    @Resource
    private AnteBusmanMapper anteBusmanMapper;
    @Override
    public List<AnteFollow> findList(Map<String, Object> queryMap) {
        return anteBusmanMapper.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return anteBusmanMapper.getTotal(queryMap);
    }

    @Override
    public int update(AnteFollow anteFollow) {
        return anteBusmanMapper.update(anteFollow);
    }

    @Override
    public Map<String, Object> findById(Integer anfoId) {
        return anteBusmanMapper.findById(anfoId);
    }

    @Override
    public int add(AnteFollow anteFollow) {
        return anteBusmanMapper.add(anteFollow);
    }

    @Override
    public int delete(String ids) {
        return anteBusmanMapper.delete(ids);
    }

}
