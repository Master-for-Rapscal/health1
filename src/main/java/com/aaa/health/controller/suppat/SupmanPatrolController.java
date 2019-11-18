package com.aaa.health.controller.suppat;

import com.aaa.health.entity.area.Area;
import com.aaa.health.entity.suppat.SupmanPatrol;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.emerg.EmerGenciesService;
import com.aaa.health.service.suppat.SupmanPatrolService;
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
@RequestMapping("/suppat")
public class SupmanPatrolController {
    @Autowired
    private SupmanPatrolService supmanPatrolService;
    @Autowired
    private EmerGenciesService emerGenciesService;
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        List<Area> list=emerGenciesService.findArea();
        model.addAttribute("list",list);
        return "suppat/list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page, @RequestParam(name = "patrolName", required = false, defaultValue = "") String patrolName,
                                       @RequestParam(name = "areaId", required = false, defaultValue = "") Integer areaId,
                                       @RequestParam(name = "beginTime", required = false, defaultValue = "") Date beginTime,
                                       @RequestParam(name = "endTime", required = false, defaultValue = "") Date endTime){
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("patrolName",patrolName);
        queryMap.put("areaId",areaId);
        queryMap.put("beginTime",beginTime);
        queryMap.put("endTime",endTime);
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", supmanPatrolService.findList(queryMap));// 页面加载数据使用
        ret.put("total", supmanPatrolService.getTotal(queryMap));// 分页使用
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
        if (supmanPatrolService.delete(ids) <= 0) {
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
    public Map<String, String> add(SupmanPatrol supmanPatrol) {
        Map<String, String> ret = new HashMap<String, String>();
        if (supmanPatrol == null) {
            ret.put("type", "error");
            ret.put("msg", "后台获取信息失败！");
            return ret;
        }
        if (supmanPatrolService.add(supmanPatrol) <= 0) {
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
    public Map<String, Object> findById(Integer patrolId) {
        Map<String, Object> pat = new HashMap<String, Object>();
        pat.put("patrol", supmanPatrolService.findById(patrolId));// 页面加载数据使用
        return pat;
    }
    /**
     * 修改信息
     *
     * @param supmanPatrol
     * @return
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> update(SupmanPatrol supmanPatrol) {
        Map<String, String> ret = new HashMap<String, String>();
        if (supmanPatrolService.update(supmanPatrol) <= 0) {
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
