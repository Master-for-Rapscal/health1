package com.aaa.health.controller.pultub;

import com.aaa.health.page.admin.Page;
import com.aaa.health.service.pultub.PuserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/puserinfo")
public class PuserinfoController {
    @Autowired
    private PuserinfoService puserinfoService;
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", puserinfoService.findList(queryMap));// 页面加载数据使用
        ret.put("total", puserinfoService.getTotal(queryMap));// 分页使用
        return ret;
    }
    //根据用户ID来查询
    @RequestMapping( "/queryUserById")
    @ResponseBody
    public Object queryById(Integer userId){
        return puserinfoService.queryUserById(userId);
    }
}
