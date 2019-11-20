package com.aaa.health.controller.busman;

import com.aaa.health.entity.anfoll.AnteFollow;
import com.aaa.health.entity.area.Area;
import com.aaa.health.entity.indis.InfDisease;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.busman.AnteBusmanService;
import com.aaa.health.service.emerg.EmerGenciesService;
import com.aaa.health.service.indis.InfDiseaseService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/antebusman")
public class AnteBusmanController {
    @Autowired
    private AnteBusmanService anteBusmanService;
    @Autowired
    private EmerGenciesService emerGenciesService;
    @Autowired
    private InfDiseaseService infDiseaseService;
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model, HttpServletRequest request) {
        List<Area> list=emerGenciesService.findArea();
        model.addAttribute("list",list);
        request.getSession().setAttribute("doctor",infDiseaseService.queryDoctor());
        return "busman/list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page,@RequestParam(name = "userId", required = false, defaultValue = "") Integer userId,
                                       @RequestParam(name = "recordName", required = false, defaultValue = "") String recordName,
                                       @RequestParam(name = "recordUnit", required = false, defaultValue = "") Integer recordUnit,
                                       @RequestParam(name = "beginTime", required = false, defaultValue = "") Date beginTime,
                                       @RequestParam(name = "endTime", required = false, defaultValue = "") Date endTime) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("userId",userId);
        queryMap.put("recordName",recordName);
        queryMap.put("recordUnit",recordUnit);
        queryMap.put("beginTime",beginTime);
        queryMap.put("endTime",endTime);
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", anteBusmanService.findList(queryMap));// 页面加载数据使用
        ret.put("total", anteBusmanService.getTotal(queryMap));// 分页使用
        return ret;
    }


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> add(AnteFollow anteFollow) {
        Map<String, String> ret = new HashMap<String, String>();
        if (anteFollow == null) {
            ret.put("type", "error");
            ret.put("msg", "后台获取信息失败！");
            return ret;
        }
        if (anteBusmanService.add(anteFollow) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "添加信息失败，请联系管理员！");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "添加失败！");
        return ret;
    }

/*
* 根据id查询数据
* */
    @RequestMapping(value = "/findById", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> findById(Integer anfoId) {
        Map<String, Object> ant = new HashMap<String, Object>();
        ant.put("ante", anteBusmanService.findById(anfoId));// 页面加载数据使用
        return ant;
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
        if (anteBusmanService.delete(ids) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "删除失败，请联系管理员处理");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "删除成功！");
        return ret;
    }
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
}