package com.aaa.health.service.womandis;

import com.aaa.health.entity.womandis.WomanDisease;
import com.aaa.health.mapper.womandis.WomanDiseaseMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class WomanDiseaseServiceImpl implements WomanDiseaseService{
    @Resource
    private WomanDiseaseMapper womanDiseaseMapper;
    @Override
    public List<WomanDisease> findList(Map<String, Object> queryMap) {
        return womanDiseaseMapper.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return womanDiseaseMapper.getTotal(queryMap);
    }

    @Override
    public int add(WomanDisease womanDisease) {
        return womanDiseaseMapper.add(womanDisease);
    }

    @Override
    public Map<String, Object> findById(Integer wodisId) {
        return womanDiseaseMapper.findById(wodisId);
    }

    @Override
    public int update(WomanDisease womanDisease) {
        return womanDiseaseMapper.update(womanDisease);
    }

    @Override
    public int delete(String ids) {
        return womanDiseaseMapper.delete(ids);
    }

    /*@Override
    public List<WomanDisease> queryRe(Integer wodisId) {
        return womanDiseaseMapper.queryRe(wodisId);
    }*/
}
