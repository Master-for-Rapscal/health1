package com.aaa.health.service.othslow;

import com.aaa.health.mapper.othslow.OthTNFMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class OthTNFServiceImpl implements OthTNFService {
    @Resource
    private OthTNFMapper othTNFMapper;
    @Override
    public List<Map> findList(Map<String, Object> queryMap) {
        return othTNFMapper.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return othTNFMapper.getTotal(queryMap);
    }
}
