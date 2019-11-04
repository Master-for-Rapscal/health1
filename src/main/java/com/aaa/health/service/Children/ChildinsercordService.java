package com.aaa.health.service.Children;

import com.aaa.health.entity.Children.Childinsrecord;
import com.aaa.health.mapper.Children.ChildInsercord;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public interface ChildinsercordService {
    int delete(String insrecordId);


    List<Childinsrecord> findList(Integer recordId);

    int getTotal(Map<String, Object> queryMap);

    //修改
    int edit(Childinsrecord childinsrecord);
    List<ChildInsercord> findBymentalMessage(Long insrecordId);

    //添加
    int add(Childinsrecord childinsrecord);
}
