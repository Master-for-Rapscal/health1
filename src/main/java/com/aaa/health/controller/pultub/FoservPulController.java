package com.aaa.health.controller.pultub;

import com.aaa.health.entity.indis.DisfollowUp;
import com.aaa.health.entity.pultub.FoservPul;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.pultub.FoservPulService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/FoservPul")
public class FoservPulController {
    @Autowired
    private FoservPulService foservPulService;
    @RequestMapping(value = "/findId", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page,Integer pultubfoId) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", foservPulService.findId(pultubfoId));// 页面加载数据使用
        ret.put("total", foservPulService.getTotal(queryMap));// 分页使用
        return ret;
    }
    @RequestMapping(value = "/findById", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> findById(Integer foserId) {
        Map<String, Object> fo = new HashMap<String, Object>();
        fo.put("foser", foservPulService.findById(foserId));// 页面加载数据使用
        return fo;
    }
    @RequestMapping(value = "/findUserId", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> findUserId(Integer pultubfoId) {
        Map<String, Object> pul = new HashMap<String, Object>();
        pul.put("finduser", foservPulService.findUserId(pultubfoId));// 页面加载数据使用
        return pul;
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> add(Integer pultubfoId,FoservPul foservPul) {
        foservPul.getPultubfoId();
        Map<String, String> ret = new HashMap<String, String>();
        if (foservPul == null) {
            ret.put("type", "error");
            ret.put("msg", "后台获取信息失败！");
            return ret;
        }
        if (foservPulService.add(foservPul) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "添加信息失败，请联系管理员！");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "添加失败！");
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
        if (foservPulService.delete(ids) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "删除失败，请联系管理员处理");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "删除成功！");
        return ret;
    }
    /**
     * 修改信息
     *
     * @param foservPul
     * @return
     * */

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> update(FoservPul foservPul) {
        Map<String, String> ret = new HashMap<String, String>();
        if (foservPulService.update(foservPul) <= 0) {
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

