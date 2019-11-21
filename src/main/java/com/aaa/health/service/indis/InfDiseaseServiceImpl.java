package com.aaa.health.service.indis;

import com.aaa.health.entity.emerg.EmerGencies;
import com.aaa.health.entity.indis.InfDisease;
import com.aaa.health.mapper.indis.InfDiseaseMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class InfDiseaseServiceImpl implements InfDiseaseService {
    @Resource
    private InfDiseaseMapper infDiseaseMapper;

    @Override
    public List<Map> queryDoctor() {
        return infDiseaseMapper.queryDoctor();
    }

    @Override
    public List<InfDisease> findList(Map<String, Object> queryMap) {
        return infDiseaseMapper.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return infDiseaseMapper.getTotal(queryMap);
    }

    @Override
    public int add(InfDisease infDisease) {
        return infDiseaseMapper.add(infDisease);
    }

    @Override
    public Map<String, Object> findById(Integer infdisId) {
        return infDiseaseMapper.findById(infdisId);
    }

    @Override
    public int edit(InfDisease infDisease) {
        return infDiseaseMapper.edit(infDisease);
    }

    @Override
    public int delete(String ids) {
        return infDiseaseMapper.delete(ids);
    }

    @Override
    public Map<String, Object> findComeId(Integer infdisId) {
        return infDiseaseMapper.findComeId(infdisId);
    }

    @Override
    public int update(InfDisease infDisease) {
        return infDiseaseMapper.update(infDisease);
    }
}
