package com.aaa.health.service.admin;

import com.aaa.health.entity.zzh.Userinfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public interface LoginService {
    List<Userinfo> LoginCheck(Map<String,Object> map);
}
