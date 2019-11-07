package com.aaa.health.controller.zzh;
import com.aaa.health.entity.zzh.Caahep;
import com.aaa.health.entity.zzh.Userinfo;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.zzh.CaahepService;
import com.aaa.health.service.zzh.UserinfoService;
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
import java.util.Map;

@Controller
@RequestMapping("zzh/caahep")
public class CaahepController {

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @Autowired
    public CaahepService caahepService;

    /**
     * 跳转到用户页面
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {

        return "caahep/list";
    }

    /**
     * 获取用户信息列表
     *
     * @param page
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page,
        @RequestParam(name = "caahepTopic", required = false, defaultValue = "")  String caahepTopic,
        @RequestParam(name = "caahepHealtype", required = false, defaultValue = "")  String caahepHealtype) {
//        System.out.println(caahepTopic+"-"+caahepHealtype);
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("caahepTopic", caahepTopic);
        queryMap.put("caahepHealtype", caahepHealtype);
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", caahepService.findList(queryMap));
        //System.out.println(userinfoService.findList(queryMap));
        ret.put("total", caahepService.getTotal(queryMap));
        return ret;
    }

    /**
     * 添加用户方法
     *
     * @param caahep
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> add(Caahep caahep) {
        Map<String, String> ret = new HashMap<String, String>();
        if (caahep == null) {
            ret.put("type", "error");
            ret.put("msg", "后台获取活动计划失败！");
            return ret;
        }
//        System.out.println(caahep);
        if (caahepService.add(caahep) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "添加活动计划失败，请联系管理员！");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "活动计划成功！");
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
//        System.out.println("后台接收数据："+ids);
        Map<String, String> ret = new HashMap<String, String>();
        if (StringUtils.isEmpty(ids)) {
            ret.put("type", "error");
            ret.put("msg", "后台获取“健康计划ID”失败");
            return ret;
        }
        if (ids.contains(",")) {
            ids = ids.substring(0, ids.length() - 1);
        }
        if (caahepService.delete(ids) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "删除健康计划失败！");
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
            ret.put("msg", "后台获取健康计划id失败！");
            return ret;
        }

//        System.out.println(caahepService.findById(id));
        Caahep data1=caahepService.findById(id);
        ret.put("datainfo",data1);
        ret.put("type", "success");
        ret.put("msg", "健康计划修改成功！");
        return ret;
    }




    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> edit(Caahep caahep) {
        Map<String, String> ret = new HashMap<String, String>();
        if (caahep == null) {
            ret.put("type", "error");
            ret.put("msg", "后台获取健康计划id失败！");
            return ret;
        }
//        System.out.println("后台接收修改id："+caahep);
        if (caahepService.edit(caahep) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "健康计划修改失败，请联系管理员！");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "健康计划修改成功！");
        return ret;
    }

}
