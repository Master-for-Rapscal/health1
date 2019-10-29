package com.aaa.health.service.Children;

import com.aaa.health.entity.Children.Childinsrecord;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public interface ChildinsercordService {
    int delete(String insrecordId);

    //添加
    List<Childinsrecord> findList(Map<String, Object> queryMap);

    int getTotal(Map<String, Object> queryMap);
}
