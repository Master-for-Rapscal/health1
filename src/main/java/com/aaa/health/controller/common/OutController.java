package com.aaa.health.controller.common;


import com.aaa.health.page.admin.Page;
import com.aaa.health.service.zzh.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/out")
public class OutController {
    @Autowired
    public UserinfoService userinfoService;


    @CrossOrigin(value="*")
    @RequestMapping(value = "/findUser", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getList( HttpServletRequest request,
                                       @RequestParam(name = "userId", required = false)  Long userId,
                                       @RequestParam(name = "recordName", required = false, defaultValue = "")  String recordName,
                                       @RequestParam(name = "userIdnumber", required = false, defaultValue = "")  String userIdnumber,
                                       @RequestParam(name = "recordUnit", required = false, defaultValue = "-1")  int recordUnit,
                                       @RequestParam(name = "recordPlaceadress", required = false, defaultValue = "")  String recordPlaceadress,
                                       @RequestParam(name = "userSex", required = false, defaultValue = "-1")  Integer userSex
    ) {
//       System.out.println("编号"+userId+"-姓名"+recordName+"-身份证"+userIdnumber+"-所属单位"+recordUnit+"-常住地址"+recordPlaceadress+"-性别"+userSex+"-");


        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("userId",userId);
        queryMap.put("recordName",recordName);
        queryMap.put("userIdnumber",userIdnumber);
        queryMap.put("recordUnit",recordUnit);
        queryMap.put("recordPlaceadress",recordPlaceadress);
        queryMap.put("userSex",userSex);
       if (userinfoService.findList(queryMap).size()<=0){
        ret.put("type","error");
        ret.put("rows", "null");
        return ret;
    }
        ret.put("type","success");
        ret.put("rows", userinfoService.findList(queryMap));
        System.out.println("准备返回数据");
        return ret;
    }
}
