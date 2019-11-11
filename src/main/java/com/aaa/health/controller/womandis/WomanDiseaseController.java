package com.aaa.health.controller.womandis;

import com.aaa.health.entity.indis.InfDisease;
import com.aaa.health.entity.womandis.WomanDisease;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.womandis.WomanDiseaseService;
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
import java.util.Map;

@Controller
@RequestMapping("/womandis")
public class WomanDiseaseController {
    @Autowired
    private WomanDiseaseService womanDiseaseService;
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list() {
        return "womandis/list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", womanDiseaseService.findList(queryMap));// 页面加载数据使用
        ret.put("total", womanDiseaseService.getTotal(queryMap));// 分页使用
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
        if (womanDiseaseService.delete(ids) <= 0) {
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
    public Map<String, String> add(Integer userId,WomanDisease womanDisease) {
        System.out.println(userId);
        womanDisease.getUserId();
        Map<String, String> ret = new HashMap<String, String>();
        if (womanDisease == null) {
            ret.put("type", "error");
            ret.put("msg", "后台获取信息失败！");
            return ret;
        }
        if (womanDiseaseService.add(womanDisease) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "添加信息失败，请联系管理员！");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "添加失败！");
        return ret;
    }
    @RequestMapping(value = "/findById", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> findById(Integer wodisId) {
        System.out.println(wodisId);
        System.out.println(womanDiseaseService.findById(wodisId));
        Map<String, Object> woman = new HashMap<String, Object>();
        woman.put("womand", womanDiseaseService.findById(wodisId));// 页面加载数据使用
        return woman;
    }
    /**
     * 修改信息
     *
     * @param womanDisease
     * @return
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> edit(WomanDisease womanDisease) {
        Map<String, String> ret = new HashMap<String, String>();
        if (womanDiseaseService.update(womanDisease) <= 0) {
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

