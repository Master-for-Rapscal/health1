package com.aaa.health.service.Children;

import com.aaa.health.entity.Children.ChildInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public interface ChildCardService {
    List<ChildInfo> findList(Map<String, Object> queryMap);

    int getTotal(Map<String, Object> queryMap);

    //添加
    int add(ChildInfo childInfo);

    //修改
    int edit(ChildInfo childInfo);

    List<ChildInfo> findByChildCard(Long addnewbornId);
}
