package com.aaa.health.service.oldpeo;

import com.aaa.health.entity.zzh.Healthcheck;
import com.aaa.health.mapper.oldpeo.OldpeoHeaMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class OldpeoHeaServiceImpl implements OldpeoHeaService {
    @Resource
    private OldpeoHeaMapper oldpeoHeaMapper;

    @Override
    public List<Map> findList(Map<String, Object> queryMap) {
        return oldpeoHeaMapper.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return oldpeoHeaMapper.getTotal(queryMap);
    }

    @Override
    public int delete(String ids) {
        return oldpeoHeaMapper.delete(ids);
    }

    @Override
    public int add(Healthcheck userinfo) {
        return oldpeoHeaMapper.add(userinfo);
    }

    @Override
    public int edit(Healthcheck userinfo) {
        return oldpeoHeaMapper.edit(userinfo);
    }

    @Override
    public Healthcheck findById(Long id) {
        return oldpeoHeaMapper.findById(id);
    }
}
