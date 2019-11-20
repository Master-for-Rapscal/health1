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
        List<Userinfo>  adb=   userinfoMapper.findList(queryMap);

        System.out.println(adb);
        return adb;
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return userinfoMapper.getTotal(queryMap);
    }

    @Override
    public int delete(String ids) {
        return userinfoMapper.delete(ids);
    }

    @Override
    public int add(Userinfo userinfo) {
        return userinfoMapper.add(userinfo);
    }

    @Override
    public int edit(Userinfo userinfo) {
        return userinfoMapper.edit(userinfo);
    }

    @Override
    public Userinfo findById(Long id) {
        return userinfoMapper.findById(id);
    }

    @Override
    public Integer queryIDnumberTotal(String userIdnumber) {
        return userinfoMapper.queryIDnumberTotal(userIdnumber);
    }
}
