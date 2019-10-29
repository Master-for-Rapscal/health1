package com.aaa.health.service.Children;

import com.aaa.health.entity.Children.Childinsrecord;
import com.aaa.health.mapper.Children.ChildInsercord;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class ChildinsercordServiceIm implements ChildinsercordService{
    @Resource
    private ChildInsercord c;

    @Override
    public int delete(String insrecordId) {
        return c.delete(insrecordId);
    }

    @Override
    public List<Childinsrecord> findList(Map<String, Object> queryMap) {
        return c.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return c.getTotal(queryMap);
    }
}
