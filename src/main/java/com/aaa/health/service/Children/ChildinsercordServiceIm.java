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
    public List<Childinsrecord> findList(Integer recordId) {
        return c.findList(recordId);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return c.getTotal(queryMap);
    }

    @Override
    public int edit(Childinsrecord childinsrecord) {
        return c.edit(childinsrecord);
    }

    @Override
    public List<ChildInsercord> findBymentalMessage(Long insrecordId) {
        return c.findBymentalMessage(insrecordId);
    }

    @Override
    public int add(Childinsrecord childinsrecord) {
        return c.add(childinsrecord);
    }
}
