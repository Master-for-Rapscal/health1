package com.aaa.health.controller.oldpeo;



import com.aaa.health.entity.zzh.Healthcheck;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.oldpeo.OldpeoHeaService;
import com.aaa.health.service.oldpeo.OldtcmService;
import com.aaa.health.service.zzh.UserinfoService;
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

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
@Controller
@RequestMapping("/oldpeohealth")

public class OldpeoHealthController {
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
    @Autowired
    private OldtcmService oldtcmService;
    @Autowired
    public UserinfoService userinfoService;
    @Autowired
    public OldpeoHeaService oldpeoHeaService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model, HttpServletRequest request) {
        int areaId2= Integer.parseInt((String)request.getSession().getAttribute("areaId"));
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("areaId",areaId2);
        model.addAttribute("doctor",oldtcmService.queryDoctor2(queryMap));
        return "oldpeohealth/list";
    }

    @RequestMapping(value = "/list2", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList2(Page page,int userinfoId) {

        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        queryMap.put("userinfoId", userinfoId);
        ret.put("rows", oldpeoHeaService.findList(queryMap));
        ret.put("total", oldpeoHeaService.getTotal(queryMap));
        return ret;
    }


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> add(Healthcheck healthcheck) {
        Map<String, String> ret = new HashMap<String, String>();
        if (healthcheck == null) {
            ret.put("type", "error");
            ret.put("msg", "后台获取用户信息失败！");
            return ret;
        }
        if (oldpeoHeaService.add(healthcheck) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "添加用户信息失败，请联系管理员！");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "体检信息添加成功！");
        return ret;
    }

    /**
     * 删除用户！
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
        if (oldpeoHeaService.delete(ids) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "删除用户数据失败！");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "删除成功！");
        return ret;
    }

    @RequestMapping(value = "/findById", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> selectById(Long id) {
        Map<String, Object> ret = new HashMap<String, Object>();
        if (id == null) {
            ret.put("type", "error");
            ret.put("msg", "后台获取用户信息失败！");
            return ret;
        }


        Healthcheck data1=oldpeoHeaService.findById(id);
        ret.put("datainfo",data1);
        ret.put("type", "success");
        ret.put("msg", "用户修改成功！");
        return ret;
    }




    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> edit(Healthcheck healthcheck) {
        Map<String, String> ret = new HashMap<String, String>();
        if (healthcheck == null) {
            ret.put("type", "error");
            ret.put("msg", "后台获取用户信息失败！");
            return ret;
        }
        if (healthcheck.getHealthcheckDate() == null) {
            ret.put("type", "error");
            ret.put("msg", "后台获取日期信息失败！");
            return ret;
        }

        if (oldpeoHeaService.edit(healthcheck) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "用户信息修改失败，请联系管理员！");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "用户修改成功！");
        return ret;
    }


}

