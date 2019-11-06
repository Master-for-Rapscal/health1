package com.aaa.health.service.womandis;

import com.aaa.health.entity.womandis.Record;
import com.aaa.health.mapper.womandis.RecordMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class RecordServiceImpl implements RecordService{
    @Resource
    private RecordMapper recordMapper;
    @Override
    public int delete(String wodisId) {
        return recordMapper.delete(wodisId);
    }

    @Override
    public List<Record> findList(Map<String, Object> queryMap) {
        return recordMapper.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return recordMapper.getTotal(queryMap);
    }
}
