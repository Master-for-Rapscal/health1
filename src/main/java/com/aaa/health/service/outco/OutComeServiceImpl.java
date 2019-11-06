package com.aaa.health.service.outco;

import com.aaa.health.entity.outco.OutCome;
import com.aaa.health.mapper.outco.OutComeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class OutComeServiceImpl implements OutComeService{
    @Resource
    private OutComeMapper outComeMapper;
    @Override
    public List<OutCome> findList(Map<String, Object> queryMap) {
        return outComeMapper.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return outComeMapper.getTotal(queryMap);
    }

    @Override
    public int add(OutCome outCome) {
        return outComeMapper.add(outCome);
    }

    @Override
    public int update(OutCome outCome) {
        return outComeMapper.update(outCome);
    }

    @Override
    public int delete(String ids) {
        return outComeMapper.delete(ids);
    }
}
