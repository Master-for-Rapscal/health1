package com.aaa.health.controller.perbabydie;

import com.aaa.health.entity.area.Area;
import com.aaa.health.entity.emerg.EmerGencies;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.emerg.EmerGenciesService;
import com.aaa.health.service.perbabydie.PerbabyDieService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("perbabydie")
public class PerbabyDieController {
    @Autowired
    private PerbabyDieService perbabyDieService;
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list() {
        return "perbabydie/list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", perbabyDieService.findList(queryMap));// 页面加载数据使用
        ret.put("total", perbabyDieService.getTotal(queryMap));// 分页使用
        return ret;
    }
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
}

