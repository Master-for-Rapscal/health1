package com.aaa.health.controller.anfoll;

import com.aaa.health.entity.anfoll.AnteFollow;
import com.aaa.health.entity.indis.DisfollowUp;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.anfoll.FindService;
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
@RequestMapping("/anfollfind")
public class findController {
    @Autowired
    private FindService findService;

    /**
     * 查询孕卡信息
     **/
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page,Integer userId) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", findService.findAnfoll(userId));// 页面加载数据使用
        ret.put("total", findService.getTotal(userId));// 分页使用
        return ret;
    }

    /**
     * 删除方法！
     *
     * @param ids
     * @return
     */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> delete(String ids) {
        Map<String, String> ret = new HashMap<String, String>();
        if (StringUtils.isEmpty(ids)) {
            ret.put("type", "error");
            ret.put("msg", "后台获取“用户ID”失败");
            return ret;
        }
        if (ids.contains(",")) {
            ids = ids.substring(0, ids.length() - 1);
        }
        if (findService.delete(ids) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "删除用户数据失败！");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "删除成功！");
        System.out.println(ret);
        return ret;
    }
    @RequestMapping(value = "/findUser", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> findUser(Integer userId) {
        Map<String, Object> ante = new HashMap<String, Object>();
        ante.put("findusers", findService.findUser(userId));// 页面加载数据使用
        return ante;
    }
/*
* 添加数据
* */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> add(AnteFollow anteFollow) {
        Map<String, String> ret = new HashMap<String, String>();
        if (anteFollow == null) {
            ret.put("type", "error");
            ret.put("msg", "后台获取信息失败！");
            return ret;
        }
        if (findService.add(anteFollow) <= 0) {
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
    public Map<String, Object> findById(Integer anfoId) {
        Map<String, Object> ret = new HashMap<String, Object>();
        //Map<String, Object> queryMap = new HashMap<String, Object>();
        ret.put("antefolls", findService.findById(anfoId));// 页面加载数据使用
        return ret;
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> update(AnteFollow anteFollow) {
        Map<String, String> ret = new HashMap<String, String>();
        if (findService.update(anteFollow) <= 0) {
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

