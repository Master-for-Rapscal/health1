package com.aaa.health.controller.indis;

import com.aaa.health.page.admin.Page;
import com.aaa.health.service.indis.IuserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/iuserinfo")
public class IuserinfoController {
    @Autowired
    private IuserinfoService iuserinfoService;
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page, @RequestParam(name = "userId", required = false, defaultValue = "") Integer userId,
                                       @RequestParam(name = "recordName", required = false, defaultValue = "") String recordName,
                                       @RequestParam(name = "beginTime", required = false, defaultValue = "") Date beginTime,
                                       @RequestParam(name = "endTime", required = false, defaultValue = "") Date endTime,
                                       HttpServletRequest request) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        int areaId= Integer.parseInt((String)request.getSession().getAttribute("areaId"));
        System.out.println("登录的值是"+areaId);
        queryMap.put("areaId",areaId);
        queryMap.put("userId",userId);
        queryMap.put("recordName",recordName);
        queryMap.put("beginTime",beginTime);
        queryMap.put("endTime",endTime);
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", iuserinfoService.findList(queryMap));// 页面加载数据使用
        ret.put("total", iuserinfoService.getTotal(queryMap));// 分页使用
        return ret;
    }
    //根据用户ID来查询
    @RequestMapping( "/queryUserById")
    @ResponseBody
    public Object queryById(Integer userId){
        return iuserinfoService.queryUserById(userId);
    }
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
}

