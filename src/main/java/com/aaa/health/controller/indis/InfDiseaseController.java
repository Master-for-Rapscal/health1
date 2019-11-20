package com.aaa.health.controller.indis;

import com.aaa.health.entity.indis.InfDisease;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.indis.InfDiseaseService;
import com.aaa.health.service.outco.OutComeService;
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
    public Map<String, Object> getList(Page page,@RequestParam(name = "userId", required = false, defaultValue = "") Integer userId,
                                       @RequestParam(name = "recordName", required = false, defaultValue = "") String recordName,
                                       @RequestParam(name = "userSex", required = false, defaultValue = "") Integer userSex,
                                       @RequestParam(name = "infdisDoctor", required = false, defaultValue = "") Integer infdisDoctor,
                                       @RequestParam(name = "beginTime", required = false, defaultValue = "") Date beginTime,
                                       @RequestParam(name = "endTime", required = false, defaultValue = "") Date endTime,
                                       @RequestParam(name = "beginTimet", required = false, defaultValue = "") Date beginTimet,
                                       @RequestParam(name = "endTimet", required = false, defaultValue = "") Date endTimet,
                                       @RequestParam(name = "outcomeWhether", required = false, defaultValue = "") Date outcomeWhether,
                                       HttpServletRequest request) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        int areaId= Integer.parseInt((String)request.getSession().getAttribute("areaId"));
        queryMap.put("areaId",areaId);
        queryMap.put("userId",userId);
        queryMap.put("recordName",recordName);
        queryMap.put("userSex",userSex);
        queryMap.put("infdisDoctor",infdisDoctor);
        queryMap.put("beginTime",beginTime);
        queryMap.put("endTime",endTime);
        queryMap.put("beginTimet",beginTimet);
        queryMap.put("endTimet",endTimet);
        queryMap.put("outcomeWhether",outcomeWhether);
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", infDiseaseService.findList(queryMap));// 页面加载数据使用
        ret.put("total", infDiseaseService.getTotal(queryMap));// 分页使用
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
    @RequestMapping(value = "/findById", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> findById(Integer infdisId) {
        Map<String, Object> fo = new HashMap<String, Object>();
        fo.put("inf", infDiseaseService.findById(infdisId));// 页面加载数据使用
        return fo;
    }
    /**
     * 修改信息
     *
     * @param infDisease
     * @return
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> edit(InfDisease infDisease) {
        Map<String, String> ret = new HashMap<String, String>();
        if (infDiseaseService.edit(infDisease) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "信息修改失败，请联系管理员！");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "修改成功！");
        return ret;
    }



    /*
     * 根据id查询数据
     * */
    @RequestMapping(value = "/findComeId", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> findComeId(Integer infdisId) {
        Map<String, Object> inf = new HashMap<String, Object>();
        inf.put("outcome", infDiseaseService.findComeId(infdisId));// 页面加载数据使用
        return inf;
    }
    /**
     * 转归
     *
     * @param infDisease
     * @return
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> update(InfDisease infDisease) {
        Map<String, String> ret = new HashMap<String, String>();
        if (infDiseaseService.update(infDisease) <= 0) {
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

