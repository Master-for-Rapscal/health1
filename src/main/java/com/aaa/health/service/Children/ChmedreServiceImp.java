package com.aaa.health.service.Children;



import com.aaa.health.entity.Children.Chmedmre;
import com.aaa.health.mapper.Children.ChmedmreMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class ChmedreServiceImp implements ChmedreService{
@Resource
private ChmedmreMapper c;


    @Override
    public int delete(String RECORD_ID) {
        return c.delete(RECORD_ID);
    }

    @Override
    public List<Chmedmre> findList(Map<String, Object> queryMap) {
        return c.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return c.getTotal(queryMap);
    }
}
