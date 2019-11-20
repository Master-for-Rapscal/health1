package com.aaa.health.controller.admin;

import com.aaa.health.entity.zzh.Healthcheck;
import com.aaa.health.entity.zzh.Userinfo;
import com.aaa.health.service.admin.LoginService;
import com.aaa.health.service.hostpit.HostService;
import com.aaa.health.service.oldpeo.OldPeopleService;
import javafx.application.HostServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/admin")
public class LoginController {
    @Autowired
    private LoginService loginService;


    @CrossOrigin(value = "*")//实现跨域请求
    @RequestMapping(value = "/LoginCheck", method = RequestMethod.POST)//映射 路径
    public Object queryCheck(String username,String IDnumber){//根据用户名  身份证号查询用户
//        String username="王宇飞";
//        String IDnumber="411082194612252245";
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("recordName",username);
        map.put("userIdnumber",IDnumber);
       /* int num=loginService.LoginCheck(map);*/
        List<Userinfo> list = loginService.LoginCheck(map);

        int num=list.size();
        return num;
    }
}
