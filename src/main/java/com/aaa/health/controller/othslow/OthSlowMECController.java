package com.aaa.health.controller.othslow;

import com.aaa.health.page.admin.Page;
import com.aaa.health.service.othslow.OthMECService;
import com.aaa.health.service.othslow.OthSlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/othslowMEC")
public class OthSlowMECController {
    @Autowired
    private OthMECService othMECService;
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String zili(){
        return "othslowMEC/list";
    }


    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page,
                                       @RequestParam(name = "userId", required = false, defaultValue = "") Integer userId,
                                       @RequestParam(name = "userName", required = false, defaultValue = "") String userName,
                                       @RequestParam(name = "userAdress", required = false, defaultValue = "") String userAdress,
                                       @RequestParam(name = "userMyphone", required = false, defaultValue = "") String userMyphone) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("userId",userId);
        queryMap.put("recordName",userName);
        queryMap.put("recordAdress",userAdress);
        queryMap.put("userMyphone",userMyphone);
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", othMECService.findList(queryMap));// 页面加载数据使用
        ret.put("total", othMECService.getTotal(queryMap));// 分页使用
        System.out.println(ret);
        return ret;
    }
}
