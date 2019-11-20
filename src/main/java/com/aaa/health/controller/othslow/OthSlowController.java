package com.aaa.health.controller.othslow;

import com.aaa.health.entity.oldpeo.Oldpeo;
import com.aaa.health.entity.othslow.Othslow;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.othslow.OthSlowService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/othslow")
public class OthSlowController {
    @Autowired
    private OthSlowService othSlowService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        Map<String, Object> queryMap = new HashMap<String, Object>();
        return "othslow/list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page,
                                       @RequestParam(name = "bianhao", required = false, defaultValue = "0") Integer bianhao,
                                       @RequestParam(name = "ming", required = false, defaultValue = "") String ming,
                /*                       @RequestParam(name = "userAdress", required = false, defaultValue = "") String userAdress,*/
                                       @RequestParam(name = "sjh", required = false, defaultValue = "") String sjh,
                                       @RequestParam(name = "othslowOutfor", required = false, defaultValue = "") String othslowOutfor,
                                       HttpServletRequest request) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("userId",bianhao);
        queryMap.put("recordName",ming);
        int areaId= Integer.parseInt((String)request.getSession().getAttribute("areaId"));
        System.out.println("登录的用户值是"+areaId);
        queryMap.put("areaId",areaId);
        queryMap.put("userMyphone",sjh);
        queryMap.put("othslowOutfor",othslowOutfor);
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", othSlowService.findList(queryMap));// 页面加载数据使用
        ret.put("total", othSlowService.getTotal(queryMap));// 分页使用
/*        System.out.println(ret);*/
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
        if (othSlowService.delete(ids) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "删除失败，请联系管理员处理");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "删除成功！");
        return ret;
    }
    @RequestMapping( "/userList")
    @ResponseBody
    public Object queryAllUser(Page page,HttpServletRequest request){
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        int areaId= Integer.parseInt((String)request.getSession().getAttribute("areaId"));
        System.out.println("登录的用户值是"+areaId);
        queryMap.put("areaId",areaId);
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", othSlowService.queryAllUser(queryMap));// 页面加载数据使用
        ret.put("total", othSlowService.queryUserTotal(queryMap));// 分页使用
        return ret;
    }


    //根据用户ID来查询
    @RequestMapping( "/queryById")
    @ResponseBody
    public Object queryById(Integer uid){
/*        System.out.println(othSlowService.queryUserById(uid));*/
        return othSlowService.queryUserById(uid);
    }

    //修改之前的查询ID来查询
    @RequestMapping( "/queryEdit")
    @ResponseBody
    public Object queryEdit(Integer othslowId){
        System.out.println("aaa"+othSlowService.queryEdit(othslowId));
        return othSlowService.queryEdit(othslowId);
    }

 //添加
    @RequestMapping( "/add")
    @ResponseBody
    public Object add(Integer uid, Othslow othslow){
        othslow.setRecordId(uid);
        Map<String,Object> map=new HashMap<String,Object>();
        System.out.println(othslow);
        int num=othSlowService.add(othslow);
/*        if(num>0){
            map.put("success","添加成功");
        }else{
            map.put("error","添加失败");
        }*/
        return num;
    }

    @RequestMapping("/queryDoctor")
    @ResponseBody
    public Object queryDoctor(HttpServletRequest request){
        Map<String,Object> queryMap=new HashMap<String,Object>();
        int areaId= Integer.parseInt((String)request.getSession().getAttribute("areaId"));
        System.out.println("登录的用户值是"+areaId);
        queryMap.put("areaId",areaId);
        return othSlowService.queryDoctor(queryMap);
    }

    @RequestMapping("/queryDis")
    @ResponseBody
    public Object queryDis(){
        return othSlowService.queryDis();
    }

    @RequestMapping("/queryName")
    @ResponseBody
    public Object queryName(){
        return othSlowService.queryName();
    }

    @RequestMapping(value = "/updateOth", method = RequestMethod.POST)
    @ResponseBody
    public Object  edit(int othslowId,Othslow othslow) {
        Map<String,Object> map=new HashMap<String,Object>();
        othslow.setOthslowId(othslowId);
                System.out.println(othslow);
        int ret=othSlowService.edit(othslow);
        return ret;
    }

    @RequestMapping(value = "/upState", method = RequestMethod.POST)
    @ResponseBody
    public Object  upState(int othslowId,Othslow othslow) {
        othslow.setOthslowId(othslowId);
        Map<String,Object> map=new HashMap<String,Object>();
/*                System.out.println(othslow);*/
        int ret=othSlowService.upState(othslow);
        return ret;
    }



}

