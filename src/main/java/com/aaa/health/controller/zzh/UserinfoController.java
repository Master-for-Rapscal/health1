package com.aaa.health.controller.zzh;
import com.aaa.health.entity.admin.SysUser;
import com.aaa.health.entity.zzh.Userinfo;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.admin.AreaService;
import com.aaa.health.service.oldpeo.OldtcmService;
import com.aaa.health.service.zzh.UserinfoService;
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
@RequestMapping("zzh/userinfo")
public class UserinfoController {

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
    private AreaService areaService;

    /**
     * 跳转到用户页面
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model, HttpServletRequest request) {

        Long areaId=Long.parseLong((String)request.getSession().getAttribute("areaId"));
        System.out.println("userInfo接受区域id："+areaId);
        System.out.println("userInfo接受区域id："+request.getSession().getAttribute("areaId"));
        System.out.println("userInfo查询到的区域："+areaService.findChildernList(areaId));
        if (areaId==410000) areaId= new Long((long)0);
        model.addAttribute("area",areaService.findChildernList(areaId));

        int areaId2= Integer.parseInt((String)request.getSession().getAttribute("areaId"));
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("areaId",areaId2);
        model.addAttribute("doctor",oldtcmService.queryDoctor2(queryMap));
        return "userinfo/list";
    }

    /**
     * 获取用户信息列表
     *
     * @param page
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page, HttpServletRequest request,
        @RequestParam(name = "userId", required = false)  Long userId,
        @RequestParam(name = "recordName", required = false, defaultValue = "")  String recordName,
        @RequestParam(name = "userIdnumber", required = false, defaultValue = "")  String userIdnumber,
        @RequestParam(name = "recordUnit", required = false, defaultValue = "-1")  int recordUnit,
        @RequestParam(name = "recordPlaceadress", required = false, defaultValue = "")  String recordPlaceadress,
        @RequestParam(name = "userSex", required = false, defaultValue = "-1")  Integer userSex
                                       ) {
//       System.out.println("编号"+userId+"-姓名"+recordName+"-身份证"+userIdnumber+"-所属单位"+recordUnit+"-常住地址"+recordPlaceadress+"-性别"+userSex+"-");


        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("userId",userId);
        queryMap.put("recordName",recordName);
        queryMap.put("userIdnumber",userIdnumber);
        int areaid = Integer.parseInt((String)request.getSession().getAttribute("areaId"));


        if (recordUnit==-1){//代表不是待条件查询/首次登录
            if (areaid==410000){areaid=-1; }
            queryMap.put("recordUnit",areaid);
        }else {
                queryMap.put("recordUnit",recordUnit);
        }
        queryMap.put("recordPlaceadress",recordPlaceadress);
        queryMap.put("userSex",userSex);
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", userinfoService.findList(queryMap));
        //System.out.println(userinfoService.findList(queryMap));
        ret.put("total", userinfoService.getTotal(queryMap));
        return ret;
    }
    /**
     * 添加用户方法
     *
     * @param userinfo
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> add(Userinfo userinfo) {
        Map<String, String> ret = new HashMap<String, String>();
        if (userinfo == null) {
            ret.put("type", "error");
            ret.put("msg", "后台获取用户信息失败！");
            return ret;
        }
//        System.out.println(userinfo);
        if (userinfoService.add(userinfo) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "添加用户信息失败，请联系管理员！");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "用户添加失败！");
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
        if (userinfoService.delete(ids) <= 0) {
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

//        System.out.println(userinfoService.findById(id));
        Userinfo data1=userinfoService.findById(id);
        ret.put("datainfo",data1);
        ret.put("type", "success");
        ret.put("msg", "用户修改成功！");
        return ret;
    }




    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> edit(Userinfo userinfo) {

        Map<String, String> ret = new HashMap<String, String>();
        if (userinfo == null) {
            ret.put("type", "error");
            ret.put("msg", "后台获取用户信息失败！");
            return ret;
        }
//        System.out.println(userinfo.getRecordName());
        System.out.println("建档方式为"+userinfo.getRecordBookbuilding());
        if (userinfoService.edit(userinfo) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "用户信息修改失败，请联系管理员！");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "用户修改成功！");
        return ret;
    }

}
