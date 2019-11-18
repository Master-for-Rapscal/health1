package com.aaa.health.controller.oldpeo;

import com.aaa.health.page.admin.Page;
import com.aaa.health.service.oldpeo.OldpeoCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/oldCard")
public class OldpeoCardController {

    @Autowired
    private OldpeoCardService oldpeoCardService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        Map<String, Object> queryMap = new HashMap<String, Object>();
        return "oldCard/list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", oldpeoCardService.findList(queryMap));// 页面加载数据使用
        ret.put("total", oldpeoCardService.getTotal(queryMap));// 分页使用
        return ret;
    }


}
