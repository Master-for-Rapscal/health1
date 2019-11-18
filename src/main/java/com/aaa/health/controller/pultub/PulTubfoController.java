package com.aaa.health.controller.pultub;

import com.aaa.health.entity.area.Area;
import com.aaa.health.entity.indis.InfDisease;
import com.aaa.health.entity.pultub.PulTubfo;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.emerg.EmerGenciesService;
import com.aaa.health.service.pultub.PulTubfoService;
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
@RequestMapping("/pultub")
public class PulTubfoController {
    @Autowired
    private PulTubfoService pulTubfoService;
    @Autowired
    private EmerGenciesService emerGenciesService;
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        List<Area> list=emerGenciesService.findArea();
        model.addAttribute("list",list);
        return "pultub/list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page,@RequestParam(name = "userId", required = false, defaultValue = "") Integer userId,
                                       @RequestParam(name = "recordName", required = false, defaultValue = "") String recordName,
                                       @RequestParam(name = "userSex", required = false, defaultValue = "") Integer userSex,
                                       @RequestParam(name = "recordUnit", required = false, defaultValue = "") Integer recordUnit,
                                       @RequestParam(name = "pultubfofoDoctor", required = false, defaultValue = "") Integer pultubfofoDoctor,
                                       @RequestParam(name = "beginTime", required = false, defaultValue = "") Date beginTime,
                                       @RequestParam(name = "endTime", required = false, defaultValue = "") Date endTime,
                                       HttpServletRequest request) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        int areaId= Integer.parseInt((String)request.getSession().getAttribute("areaId"));
        System.out.println("登录的值是"+areaId);
        queryMap.put("areaId",areaId);
        queryMap.put("userId",userId);
        queryMap.put("recordName",recordName);
        queryMap.put("userSex",userSex);
        queryMap.put("recordUnit",recordUnit);
        queryMap.put("pultubfofoDoctor",pultubfofoDoctor);
        queryMap.put("beginTime",beginTime);
        queryMap.put("endTime",endTime);
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", pulTubfoService.findList(queryMap));// 页面加载数据使用
        ret.put("total", pulTubfoService.getTotal(queryMap));// 分页使用
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
        if (pulTubfoService.delete(ids) <= 0) {
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
    public Map<String, String> add(PulTubfo pulTubfo) {
        System.out.println(pulTubfo);
        Map<String, String> ret = new HashMap<String, String>();
        if (pulTubfo == null) {
            ret.put("type", "error");
            ret.put("msg", "后台获取信息失败！");
            return ret;
        }
        if (pulTubfoService.add(pulTubfo) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "添加信息失败，请联系管理员！");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "添加失败！");
        System.out.println(ret);
        return ret;
    }

    @RequestMapping(value = "/findById", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> findById(Integer pultubfoId) {
        System.out.println(pultubfoId);
        System.out.println(pulTubfoService.findById(pultubfoId));
        Map<String, Object> pul = new HashMap<String, Object>();
        pul.put("pultu", pulTubfoService.findById(pultubfoId));// 页面加载数据使用
        return pul;
    }
    /**
     * 修改信息
     *
     * @param pulTubfo
     * @return
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> edit(PulTubfo pulTubfo) {
        Map<String, String> ret = new HashMap<String, String>();
        if (pulTubfoService.edit(pulTubfo) <= 0) {
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

