package com.aaa.health.controller.oldpeo;

import com.aaa.health.entity.admin.Menu;
import com.aaa.health.entity.oldpeo.Oldarrange;
import com.aaa.health.entity.oldpeo.Oldpeo;
import com.aaa.health.entity.oldpeo.Oldtcm;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.oldpeo.OldPeopleService;
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
import java.util.List;
import java.util.Map;
@Controller
@RequestMapping("/oldpeo/oldp")
public class OldpeoController {
    @Autowired
    private OldPeopleService oldPeopleService;
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        Map<String, Object> queryMap = new HashMap<String, Object>();
        return "oldpeo/list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page,
                                       @RequestParam(name = "userId", required = false, defaultValue = "") Integer userId,
                                       @RequestParam(name = "userName", required = false, defaultValue = "") String userName,
                                       @RequestParam(name = "userAdress", required = false, defaultValue = "") String userAdress,
                                       @RequestParam(name = "userMyphone", required = false, defaultValue = "") String userMyphone) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("userId",userId);
        queryMap.put("recordName",userName);
        queryMap.put("recordAdress",userAdress);
        queryMap.put("userMyphone",userMyphone);

        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", oldPeopleService.findList(queryMap));// 页面加载数据使用
        ret.put("total", oldPeopleService.getTotal(queryMap));// 分页使用
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
        if (oldPeopleService.delete(ids) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "删除失败，请联系管理员处理");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "删除成功！");
        return ret;
    }


    @RequestMapping(value = "/deleteArr", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> deleteArr(String ids) {
        Map<String, String> ret = new HashMap<String, String>();
        if (StringUtils.isEmpty(ids)) {
            ret.put("type", "error");
            ret.put("msg", "请选择需要删除的数据，后端未收到");
            return ret;
        }
        if (ids.contains(",")) {
            ids = ids.substring(0, ids.length() - 1);
        }
        if (oldPeopleService.deleteArr(ids) <= 0) {
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
    public Object queryAllUser(Page page){
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", oldPeopleService.queryAllUser(queryMap));// 页面加载数据使用
        ret.put("total", oldPeopleService.queryUserTotal(queryMap));// 分页使用
        return ret;
    }
    //根据用户ID来查询
    @RequestMapping( "/queryById")
    @ResponseBody
    public Object queryById(Integer uid){
        System.out.println(oldPeopleService.queryUserById(uid));
        return oldPeopleService.queryUserById(uid);
    }


    @RequestMapping( "/queryArrange")
    @ResponseBody
    public Object queryArrange(Integer oldpeoId){
  /*      System.out.println(oldPeopleService.queryArrange(oldpeoId));*/
        return oldPeopleService.queryArrange(oldpeoId);
    }
    @RequestMapping( "/queryAll")
    @ResponseBody
    public Object queryAll(Map map){
  /*      System.out.println(oldPeopleService.queryAll(map));*/
        return oldPeopleService.queryAll(map);
    }
    //根据用户ID来查询
    @RequestMapping( "/add")
    @ResponseBody
    public Object add(Integer uid,Oldpeo oldpeo){
        oldpeo.setRecordId(uid);
        Map<String,Object> map=new HashMap<String,Object>();
        int num=oldPeopleService.add(oldpeo);
/*        if(num>0){
            map.put("success","添加成功");
        }else{
            map.put("error","添加失败");
        }*/
        return num;
    }

    @RequestMapping("/queryDoctor")
    @ResponseBody
    public Object queryDoctor(){
        return oldPeopleService.queryDoctor();
    }
    @RequestMapping( "/addSuif")
    @ResponseBody
    public Object addSuif(Integer oldpeoId, Oldarrange oldarrange){
        oldarrange.setOldpeoId(oldpeoId);
/*        System.out.println(  "aaaaaaaaaaaaaaaa"+oldpeoId);
        System.out.println(  "aaaaaaaaaaaaaaaa"+oldarrange);*/
        Map<String,Object> map=new HashMap<String,Object>();
        int num=oldPeopleService.addSui(oldarrange);
/*        if(num>0){
            map.put("success","添加成功");
        }else{
            map.put("error","添加失败");
        }*/
        return num;
    }

    @RequestMapping( "/queryArr")
    @ResponseBody
    public Object queryArr(int oldarrangeId){
        /*        System.out.println(oldtcmService.queryId(oldtcmId));*/
        return oldPeopleService.queryArr(oldarrangeId);
    }


    @RequestMapping( "/queryId")
    @ResponseBody
    public Object queryId( ){
        System.out.println(oldPeopleService.queryId());
        return oldPeopleService.queryId();
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Object  edit(Oldpeo oldpeo) {
        Map<String,Object> map=new HashMap<String,Object>();
/*        System.out.println(oldpeo);*/
        int ret=oldPeopleService.edit(oldpeo);
        return ret;
    }

    @RequestMapping(value = "/updateArr", method = RequestMethod.POST)
    @ResponseBody
    public Object  updateArr(Oldarrange oldarrange) {
        Map<String,Object> map=new HashMap<String,Object>();
                System.out.println("aa"+oldarrange);
        int ret=oldPeopleService.updateArr(oldarrange);
        return ret;
    }

}
