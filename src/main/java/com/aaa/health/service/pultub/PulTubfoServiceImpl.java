package com.aaa.health.service.pultub;

import com.aaa.health.entity.pultub.PulTubfo;
import com.aaa.health.mapper.pultub.PulTubfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class PulTubfoServiceImpl implements PulTubfoService{
    @Resource
    private PulTubfoMapper pulTubfoMapper;
    @Override
    public List<PulTubfo> findList(Map<String, Object> queryMap) {
        return pulTubfoMapper.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return pulTubfoMapper.getTotal(queryMap);
    }

    @Override
    public int add(PulTubfo pulTubfo) {
        return pulTubfoMapper.add(pulTubfo);
    }

    @Override
    public Map<String, Object> findById(Integer pultubfoId) {
        return pulTubfoMapper.findById(pultubfoId);
    }

    @Override
    public int edit(PulTubfo pulTubfo) {
        return pulTubfoMapper.edit(pulTubfo);
    }

    @Override
    public int delete(String ids) {
        return pulTubfoMapper.delete(ids);
    }
}
