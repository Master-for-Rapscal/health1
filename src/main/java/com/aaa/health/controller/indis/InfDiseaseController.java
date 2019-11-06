package com.aaa.health.controller.indis;

import com.aaa.health.entity.indis.DisfollowUp;
import com.aaa.health.entity.indis.InfDisease;
import com.aaa.health.entity.suppat.SupmanPatrol;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.indis.InfDiseaseService;
import com.aaa.health.service.outco.OutComeService;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.mapping.ParameterMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/indis")
public class InfDiseaseController {
@Autowired
private InfDiseaseService infDiseaseService;
@Autowired
private OutComeService outComeService;
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model, HttpServletRequest request) {

        request.getSession().setAttribute("doctor",infDiseaseService.queryDoctor());
        return "indis/list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", infDiseaseService.findList(queryMap));// 页面加载数据使用
        ret.put("total", infDiseaseService.getTotal(queryMap));// 分页使用
        System.out.println(ret);
        return ret;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> delete(String ids) {
        Map<String, String> ret = new HashMap<String, String>();
        if (StringUtils.isEmpty(ids)) {
            ret.put("type", "error");
            ret.put("msg", "请选择需要删除的数据，后端未收到");
            return ret;
        }
        if (ids.contains(",")) {
            ids = ids.substring(0, ids.length() - 1);
        }
        if (infDiseaseService.delete(ids) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "删除失败，请联系管理员处理");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "删除成功！");
        return ret;
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> add(InfDisease infDisease) {
        Map<String, String> ret = new HashMap<String, String>();
        if (infDisease == null) {
            ret.put("type", "error");
            ret.put("msg", "后台获取信息失败！");
            return ret;
        }
        if (infDiseaseService.add(infDisease) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "添加信息失败，请联系管理员！");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "添加失败！");
        return ret;
    }
}

