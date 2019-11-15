package com.aaa.health.controller.othslow;

import com.aaa.health.entity.zzh.Healthcheck;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.oldpeo.OldpeoHeaService;
import com.aaa.health.service.othslow.OthMECService;
import com.aaa.health.service.othslow.OthSlowService;
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
@RequestMapping("/othslowMEC")
public class OthSlowMECController {
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
    @Autowired
    private OthMECService othMECService;
/*    @Autowired
    public OthMECService oldpeoHeaService;*/
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String zili(){
        return "othslowMEC/list";
    }


    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page,
                                       @RequestParam(name = "bianhao", required = false, defaultValue = "") Integer bianhao,
                                       @RequestParam(name = "ming", required = false, defaultValue = "") String ming,
                                       @RequestParam(name = "userAdress", required = false, defaultValue = "") String userAdress,
                                       @RequestParam(name = "sjh", required = false, defaultValue = "") String sjh,
                                       @RequestParam(name = "oldpeoMstate", required = false, defaultValue = "0") String oldpeoMstate,
                                       HttpServletRequest request) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        int areaId= Integer.parseInt((String)request.getSession().getAttribute("areaId"));
        System.out.println("登录的用户值是"+areaId);
        queryMap.put("areaId",areaId);
        queryMap.put("userId",bianhao);
        queryMap.put("recordName",ming);
        queryMap.put("recordAdress",userAdress);
        queryMap.put("userMyphone",sjh);
        queryMap.put("oldpeoMstate",oldpeoMstate);
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", othMECService.findList(queryMap));// 页面加载数据使用
        ret.put("total", othMECService.getTotal(queryMap));// 分页使用
        System.out.println(ret);
        return ret;
    }

    @RequestMapping(value = "/list2", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList2(Page page,int userinfoId) {

        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        queryMap.put("userinfoId", userinfoId);
        //   System.out.println( healthcheckService.findList(queryMap));
        ret.put("rows", othMECService.findList2(queryMap));
        ret.put("total", othMECService.getTotal2(queryMap));
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
//        System.out.println(healthcheck);
        if (othMECService.add(healthcheck) <= 0) {
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
        if (othMECService.delete(ids) <= 0) {
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

//        System.out.println(id);
//        System.out.println(healthcheckService.findById(id));
        Healthcheck data1=othMECService.findById(id);
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

        if (othMECService.edit(healthcheck) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "用户信息修改失败，请联系管理员！");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "用户修改成功！");
        return ret;
    }




}
