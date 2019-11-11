package com.aaa.health.service.pultub;

import com.aaa.health.entity.pultub.FoservPul;
import com.aaa.health.mapper.pultub.FoservPulMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class FoservPulServiceImpl implements FoservPulService{
    @Resource
    private FoservPulMapper foservPulMapper;
    @Override
    public int delete(String foserId) {
        return foservPulMapper.delete(foserId);
    }


    @Override
    public List<FoservPul> findId(Integer pultubfoId) {
        return foservPulMapper.findId(pultubfoId);
    }


    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return foservPulMapper.getTotal(queryMap);
    }

    @Override
    public Map<String,Object> findById(Integer foserId) {
        return foservPulMapper.findById(foserId);
    }

    @Override
    public List<FoservPul> findUserId(Integer pultubfoId) {
        return foservPulMapper.findUserId(pultubfoId);
    }

    @Override
    public int add(FoservPul foservPul) {
        return foservPulMapper.add(foservPul);
    }

    @Override
    public int update(FoservPul foservPul) {
        return foservPulMapper.update(foservPul);
    }
}
