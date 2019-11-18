package com.aaa.health.controller.oldpeo;

import com.aaa.health.page.admin.Page;
import com.aaa.health.service.oldpeo.OldpeoCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/oldCard")
public class OldpeoCardController {

    @Autowired
    private OldpeoCardService oldpeoCardService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {

        return "oldCard/list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page, HttpServletRequest request) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        int areaId= Integer.parseInt((String)request.getSession().getAttribute("areaId"));
        queryMap.put("recordUnit",areaId);
     /*   String diqu="河南";
        if(areaId==410000){
            queryMap.put("areaName",diqu);

        }*/
        queryMap.put("areaId",areaId);
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", oldpeoCardService.findList(queryMap));// 页面加载数据使用
        ret.put("total", oldpeoCardService.getTotal(queryMap));// 分页使用
        return ret;
    }


}
