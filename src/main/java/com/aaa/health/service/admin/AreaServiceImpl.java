package com.aaa.health.service.admin;

import com.aaa.health.entity.area.Area;
import com.aaa.health.mapper.admin.AreaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    public AreaMapper areaMapper;

    @Override
    public int add(Area menu) {
        return areaMapper.add(menu);
    }

    @Override
    public List<Area> findList(Map<String, Object> queryMap) {
        return areaMapper.findList(queryMap);
    }

    @Override
    public List<Area> findTopList() {
        return areaMapper.findTopList();
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return areaMapper.getTotal(queryMap);
    }

    @Override
    public int edit(Area area) {
        return areaMapper.edit(area);
    }

    @Override
    public int delete(Long id) {
        return areaMapper.delete(id);
    }

    @Override
    public List<Area> findChildernList(Long parentId) {
        return areaMapper.findChildernList(parentId);
    }

    @Override
    public List<Area> findListByIds(String ids) {
        return areaMapper.findListByIds(ids);
    }
}
