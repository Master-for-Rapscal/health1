package com.aaa.health.service.supman;

import com.aaa.health.entity.area.Area;
import com.aaa.health.entity.supman.SupmanReport;
import com.aaa.health.mapper.supman.SupmanReportMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class SupmanReportServiceImpl implements SupmanReportService{
@Resource
private SupmanReportMapper supmanReportMapper;
    @Override
    public List<SupmanReport> findList(Map<String, Object> queryMap) {
        return supmanReportMapper.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return supmanReportMapper.getTotal(queryMap);
    }

    @Override
    public int add(SupmanReport supmanReport) {
        return supmanReportMapper.add(supmanReport);
    }


    @Override
    public int update(SupmanReport supmanReport) {
        return supmanReportMapper.update(supmanReport);
    }

    @Override
    public int delete(String ids) {
        return supmanReportMapper.delete(ids);
    }

}
