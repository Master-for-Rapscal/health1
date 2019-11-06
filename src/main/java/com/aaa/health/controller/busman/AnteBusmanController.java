package com.aaa.health.controller.busman;

import com.aaa.health.entity.anfoll.AnteFollow;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.busman.AnteBusmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/antebusman")
public class AnteBusmanController {
    @Autowired
    private AnteBusmanService anteBusmanService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list() {
        return "busman/list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        System.out.println(anteBusmanService.findList(queryMap));
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", anteBusmanService.findList(queryMap));// 页面加载数据使用
        ret.put("total", anteBusmanService.getTotal(queryMap));// 分页使用
        return ret;
    }
    /**
     * 修改信息
     *
     * @param anteFollow
     * @return
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> update(AnteFollow anteFollow) {
        Map<String, String> ret = new HashMap<String, String>();
        if (anteBusmanService.update(anteFollow) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "信息修改失败，请联系管理员！");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "修改成功！");
        return ret;
    }
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
}