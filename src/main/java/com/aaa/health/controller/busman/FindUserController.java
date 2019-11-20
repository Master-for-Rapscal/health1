package com.aaa.health.controller.busman;

import com.aaa.health.page.admin.Page;
import com.aaa.health.service.busman.FindUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/finduser")
public class FindUserController {
    @Autowired
    private FindUserService findUserService;
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page,@RequestParam(name = "userId", required = false, defaultValue = "") Integer userId,
                                       @RequestParam(name = "recordName", required = false, defaultValue = "") String recordName) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("userId",userId);
        queryMap.put("recordName",recordName);
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", findUserService.findList(queryMap));// 页面加载数据使用
        ret.put("total", findUserService.getTotal(queryMap));// 分页使用
        return ret;
    }
    //根据用户ID来查询
    @RequestMapping( "/findUserId")
    @ResponseBody
    public Object findUserId(Integer userId){
        System.out.println(userId);
        System.out.println(findUserService.findUserId(userId));
        return findUserService.findUserId(userId);
    }
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
}
