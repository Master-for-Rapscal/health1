package com.aaa.health.controller.oldpeo;

import com.aaa.health.entity.oldpeo.Oldself;
import com.aaa.health.entity.oldpeo.Oldtcm;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.oldpeo.OldtcmService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/OldpeoZhongYi")
public class OldpeoZhongYiController {
    @Autowired
    private OldtcmService oldtcmService;
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String zy(){
        return "oldpeozhongyi/list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page,
                                       @RequestParam(name = "userId", required = false, defaultValue = "") Integer userId,
                                       @RequestParam(name = "userName", required = false, defaultValue = "") String userName,
                                       @RequestParam(name = "userAdress", required = false, defaultValue = "") String userAdress,
                                       @RequestParam(name = "userMyphone", required = false, defaultValue = "") String userMyphone,
                                       HttpServletRequest request) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        int areaId= Integer.parseInt((String)request.getSession().getAttribute("areaId"));
        System.out.println("登录的用户值是"+areaId);
        queryMap.put("areaId",areaId);
        queryMap.put("userId",userId);
        queryMap.put("recordName",userName);
        queryMap.put("recordAdress",userAdress);
        queryMap.put("userMyphone",userMyphone);
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", oldtcmService.findList(queryMap));// 页面加载数据使用
        ret.put("total", oldtcmService.getTotal(queryMap));// 分页使用
        return ret;
    }

    @RequestMapping( "/userList")
    @ResponseBody
    public Object queryAllUser(int oldpeoId,Page page, HttpServletRequest request){

        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        int areaId= Integer.parseInt((String)request.getSession().getAttribute("areaId"));
        System.out.println("登录的用户值是"+areaId);
        queryMap.put("areaId",areaId);
        queryMap.put("oldpeoId",oldpeoId);
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", oldtcmService.queryAllUser(queryMap));// 页面加载数据使用
        ret.put("total", oldtcmService.queryUserTotal(queryMap));// 分页使用
/*        System.out.println(oldtcmService.queryAllUser(queryMap));*/
        return ret;
    }

    @RequestMapping( "/queryById")
    @ResponseBody
    public Object queryById( Integer uid){
        System.out.println(uid);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("uid",uid);

        return oldtcmService.queryUserById(uid);
    }

    @RequestMapping( "/add")
    @ResponseBody
    public Object add(Integer uid, Oldtcm oldtcm){

        Map<String,Object> map=new HashMap<String,Object>();
        int num=oldtcmService.add(oldtcm);
        return num;
    }
    @RequestMapping(value = "/del", method = RequestMethod.POST)
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
        if (oldtcmService.delete(ids) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "删除失败，请联系管理员处理");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "删除成功！");
        return ret;
    }
    @RequestMapping( "/queryId")
    @ResponseBody
    public Object queryId(int oldtcmId){
/*        System.out.println(oldtcmService.queryId(oldtcmId));*/
        return oldtcmService.queryId(oldtcmId);
    }


    @RequestMapping(value = "/updatetcm", method = RequestMethod.POST)
    @ResponseBody
    public Object  edit(Oldtcm oldtcm) {
        Map<String,Object> map=new HashMap<String,Object>();
/*        System.out.println(oldtcm);*/
        int ret=oldtcmService.edit(oldtcm);
        return ret;
    }
    @RequestMapping("/queryDoctor")
    @ResponseBody
    public Object queryDoctor(){

        return oldtcmService.queryDoctor();
    }


    @RequestMapping("/queryDoctor2")
    @ResponseBody
    public Object queryDoctor2( HttpServletRequest request){
        Map<String, Object> queryMap = new HashMap<String, Object>();
        int areaId= Integer.parseInt((String)request.getSession().getAttribute("areaId"));
        System.out.println("登录的用户值是"+areaId);
        queryMap.put("areaId",areaId);

        return oldtcmService.queryDoctor2(queryMap);
    }


}
