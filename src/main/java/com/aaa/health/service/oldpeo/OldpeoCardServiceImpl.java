package com.aaa.health.service.oldpeo;


import com.aaa.health.mapper.oldpeo.OldpeoCardMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class OldpeoCardServiceImpl implements OldpeoCardService {
    @Resource
    private OldpeoCardMapper oldpeoCardMapper;
    @Override
    public List<Map> findList(Map<String, Object> queryMap) {
        return oldpeoCardMapper.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return oldpeoCardMapper.getTotal(queryMap);
    }
}
