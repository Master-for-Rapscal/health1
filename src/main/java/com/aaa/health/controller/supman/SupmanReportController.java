package com.aaa.health.controller.supman;

import com.aaa.health.entity.area.Area;
import com.aaa.health.entity.supman.SupmanReport;
import com.aaa.health.entity.suppat.SupmanPatrol;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.emerg.EmerGenciesService;
import com.aaa.health.service.supman.SupmanReportService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/supre")
public class SupmanReportController {
    @Autowired
    private SupmanReportService supmanReportService;
    @Autowired
    private EmerGenciesService emerGenciesService;
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        List<Area> list=emerGenciesService.findArea();
        model.addAttribute("list",list);
        return "supre/list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page,@RequestParam(name = "reportCategory", required = false, defaultValue = "") Integer reportCategory,
                                       @RequestParam(name = "reportName", required = false, defaultValue = "") String reportName,
                                       @RequestParam(name = "beginTime", required = false, defaultValue = "") Date beginTime,
                                       @RequestParam(name = "endTime", required = false, defaultValue = "") Date endTime) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("reportCategory",reportCategory);
        queryMap.put("reportName",reportName);
        queryMap.put("beginTime",beginTime);
        queryMap.put("endTime",endTime);
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", supmanReportService.findList(queryMap));// 页面加载数据使用
        ret.put("total", supmanReportService.getTotal(queryMap));// 分页使用
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
        if (supmanReportService.delete(ids) <= 0) {
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
    public Map<String, String> add(SupmanReport supmanReport) {
        Map<String, String> ret = new HashMap<String, String>();
        if (supmanReport == null) {
            ret.put("type", "error");
            ret.put("msg", "后台获取信息失败！");
            return ret;
        }
        if (supmanReportService.add(supmanReport) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "添加信息失败，请联系管理员！");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "添加失败！");
        return ret;
    }
    /**
     * 修改信息
     *
     * @param supmanReport
     * @return
     * */

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> update(SupmanReport supmanReport) {
        Map<String, String> ret = new HashMap<String, String>();
        int b=supmanReportService.update(supmanReport);
        if (supmanReportService.update(supmanReport) <= 0) {
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
