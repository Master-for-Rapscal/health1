package com.aaa.health.controller.zzh;
import com.aaa.health.entity.zzh.Actrecord;
import com.aaa.health.entity.zzh.Caahep;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.zzh.ActrecordService;
import com.aaa.health.service.zzh.CaahepService;
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
@RequestMapping("zzh/actrecord")
public class Caahep2Controller {

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @Autowired
    public CaahepService caahepService;
    @Autowired
    public ActrecordService actrecordService;

    /**
     * 跳转到用户页面
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {

        return "caahep/list2";
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
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("caahepTopic", caahepTopic);
        queryMap.put("caahepHealtype", caahepHealtype);
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", caahepService.findList(queryMap));
        ret.put("total", caahepService.getTotal(queryMap));
        return ret;
    }

    @RequestMapping(value = "/list2", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList2(Page page,String caahepId) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("caahepId", caahepId);
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", actrecordService.findList(queryMap));
        ret.put("total", actrecordService.getTotal(queryMap));
        return ret;
    }
    /**
     * 添加用户方法
     *
     * @param actrecord
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> add(Actrecord actrecord) {
        Map<String, String> ret = new HashMap<String, String>();
        if (actrecord == null) {
            ret.put("type", "error");
            ret.put("msg", "后台获取活动计划失败！");
            return ret;
        }
        if (actrecordService.add(actrecord) <= 0) {
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
        System.out.println("（删除）后台接收数据："+ids);
        Map<String, String> ret = new HashMap<String, String>();
        if (StringUtils.isEmpty(ids)) {
            ret.put("type", "error");
            ret.put("msg", "后台获取“健康计划ID”失败");
            return ret;
        }
        if (ids.contains(",")) {
            ids = ids.substring(0, ids.length() - 1);
        }
        if (actrecordService.delete(ids) <= 0) {
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
//        System.out.println("查个体"+id);
//       System.out.println("查个体"+actrecordService.findById(id));
        Actrecord data1=actrecordService.findById(id);
        ret.put("datainfo",data1);
        ret.put("type", "success");
        ret.put("msg", "健康计划修改成功！");
        return ret;
    }




    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> edit(Actrecord actrecord) {
        Map<String, String> ret = new HashMap<String, String>();
        if (actrecord == null) {
            ret.put("type", "error");
            ret.put("msg", "后台获取健康计划id失败！");
            return ret;
        }
       System.out.println("后台接收修改id："+actrecord);
        if (actrecordService.edit(actrecord) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "健康计划修改失败，请联系管理员！");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "健康计划修改成功！");
        return ret;
    }

}
