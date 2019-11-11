package com.aaa.health.service.womandis;

import com.aaa.health.entity.womandis.Record;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public interface RecordService {
    int delete(String wodisId);

    //添加
    List<Record> findList(Integer userId);

    int getTotal(Map<String, Object> queryMap);
}
