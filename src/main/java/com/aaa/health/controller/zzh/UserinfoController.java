package com.aaa.health.controller.zzh;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.zzh.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserinfoController {

    @Autowired
    public UserinfoService userinfoService;

    /**
     * 跳转到用户页面
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {

        return "userinfo/list";
    }

    /**
     * 获取用户信息列表
     *
     * @param page
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", userinfoService.findList(queryMap));
        ret.put("total", userinfoService.getTotal(queryMap));
        return ret;
    }

}
