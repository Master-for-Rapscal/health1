package com.aaa.health.controller.indis;

import com.aaa.health.entity.indis.DisfollowUp;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.indis.DisfollowUpService;
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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/DisfollowUp")
public class DisfollowUpController {
    @Autowired
    private DisfollowUpService disfollowUpService;


    /**
     * 查询传染病随访记录
     **/
    @RequestMapping(value = "/findId", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page,Integer infdisId) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", disfollowUpService.findId(infdisId));// 页面加载数据使用
        ret.put("total", disfollowUpService.getTotal(infdisId));// 分页使用
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
            ret.put("msg", "后台获取ID失败");
            return ret;
        }
        if (ids.contains(",")) {
            ids = ids.substring(0, ids.length() - 1);
        }
        if (disfollowUpService.delete(ids) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "删除数据失败！");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "删除成功！");
        return ret;
    }
    @RequestMapping(value = "/findUserId", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> findUserId(Integer infdisId) {
        Map<String, Object> fd = new HashMap<String, Object>();
        fd.put("finduser", disfollowUpService.findUserId(infdisId));// 页面加载数据使用
        return fd;
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> add(Integer infdisId,DisfollowUp disfollowUp) {
        disfollowUp.getInfdisId();
        Map<String, String> ret = new HashMap<String, String>();
        if (disfollowUp == null) {
            ret.put("type", "error");
            ret.put("msg", "后台获取信息失败！");
            return ret;
        }
        if (disfollowUpService.add(disfollowUp) <= 0) {
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
    public Map<String, Object> findById(Integer disfopId) {
        Map<String, Object> ret = new HashMap<String, Object>();
        ret.put("InfDisease", disfollowUpService.findById(disfopId));// 页面加载数据使用
        return ret;
    }
    /**
     * 修改信息
     *
     * @param disfollowUp
     * @return
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> update(DisfollowUp disfollowUp) {
        Map<String, String> ret = new HashMap<String, String>();
        if (disfollowUpService.update(disfollowUp) <= 0) {
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

