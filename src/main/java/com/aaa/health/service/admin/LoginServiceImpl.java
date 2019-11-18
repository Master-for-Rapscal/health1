package com.aaa.health.service.admin;

import com.aaa.health.entity.zzh.Userinfo;
import com.aaa.health.mapper.admin.LoginMapper;
import com.aaa.health.mapper.hostpit.HostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private LoginMapper loginMapper;
    @Override
    public List<Userinfo> LoginCheck(Map<String, Object> map) {
        return loginMapper.LoginCheck(map);
    }
}
