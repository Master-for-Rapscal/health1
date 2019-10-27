package com.aaa.health.service.zzh;

import com.aaa.health.entity.zzh.Userinfo;
import com.aaa.health.mapper.zzh.UserinfoMapper;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserInfoServiceImpl implements UserinfoService {
    @Autowired
    private UserinfoMapper userinfoMapper;
    @Override
    public List<Userinfo> findList(Map<String, Object> queryMap) {
        return userinfoMapper.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return userinfoMapper.getTotal(queryMap);
    }
}
