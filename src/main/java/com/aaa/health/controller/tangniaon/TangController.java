package com.aaa.health.controller.tangniaon;

import com.aaa.health.entity.tangniaon.Tang;
import com.aaa.health.entity.tangniaon.TangNiaon;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.tangniaon.TangService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/tang")
public class TangController {
    @Resource
    private TangService tangService;

    @InitBinder
    protected  void  init(WebDataBinder binder){
        SimpleDateFormat dataFormate=new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class,new CustomDateEditor(dataFormate,true));
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String goTang( HttpServletRequest request){
        request.getSession().setAttribute("ltf",tangService.queryDoctor());
        //System.out.println(tangService.queryDoctor());
        return "tangniaon/list";
    }

    @RequestMapping(value = "list", method = RequestMethod.POST)
    @ResponseBody
    public Object queryAll(Page page,
                           @RequestParam(name = "userbian", required = false, defaultValue = "0") Integer userbian,
                           @RequestParam(name = "userMing", required = false, defaultValue = "") String userMing,
                           @RequestParam(name = "usersex", required = false, defaultValue = "0") String usersex,
                           @RequestParam(name = "userAdress", required = false, defaultValue = "") String userAdress,
                           @RequestParam(name = "userphone", required = false, defaultValue = "") String userphone,
                           @RequestParam(name = "userIdcard", required = false, defaultValue = "") String userIdcard){
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        queryMap.put("userId",userbian);
        queryMap.put("recordName",userMing);
        queryMap.put("usersex",usersex);
        queryMap.put("recordAdress",userAdress);
        queryMap.put("userMyphone",userphone);
        queryMap.put("userIdnumber",userIdcard);
        ret.put("rows", tangService.queryAll(queryMap));// 页面加载数据使用
        ret.put("total", tangService.queryTotal(queryMap));// 分页使用
        return  ret;
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
        System.out.println("------"+ids);
        if (tangService.deleteById(ids) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "删除失败，请联系管理员处理");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "删除成功！");
        return ret;
    }


    // 查询不是糖尿病患者的信息
    @RequestMapping( "/userList")
    @ResponseBody
    public Object queryAllUser(Page page,
                               @RequestParam(name = "userbianhao", required = false, defaultValue = "") String userbianhao,
                               @RequestParam(name = "userName", required = false, defaultValue = "") String userName,
                               @RequestParam(name = "userAdress", required = false, defaultValue = "") String userAdress,
                               @RequestParam(name = "username", required = false, defaultValue = "") String userPhone){
        System.out.println("----------------------------------");
        System.out.println(userbianhao);
        System.out.println(userName);
        System.out.println(userAdress);
        System.out.println(userPhone);
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        queryMap.put("userId",userbianhao);
        queryMap.put("recordName",userName);
        queryMap.put("recordAdress",userAdress);
        queryMap.put("userMyphone",userPhone);
        ret.put("rows", tangService.queryAllUser(queryMap));// 页面加载数据使用
        ret.put("total", tangService.queryUserTotal(queryMap));// 分页使用
        return ret;
    }

    //根据用户ID来查询
    @RequestMapping( "/queryById")
    @ResponseBody
    public Object queryById(int uid){
        return tangService.queryUserById(uid);
    }

//    @RequestMapping("/queryDoctor")
//    @ResponseBody
//    public Object queryDoctor(){
//        return tangService.queryDoctor();
//    }

    @RequestMapping("/insertDmsm")
    @ResponseBody
    public Object insertDmsm(Integer uid, TangNiaon tangNiaon){
        tangNiaon.setRecordId(uid);
        Map<String,Object> map=new HashMap<String,Object>();
        int num=tangService.insertDmsm(tangNiaon);
        if(num>0){
            map.put("msg","success");
            map.put("info","添加成功");
        }else{
            map.put("msg","error");
            map.put("info","添加失败");
        }
        return map;
    }

    @RequestMapping("queryDmsmById")
    @ResponseBody
    public Object queryDmsmById(Integer uid){
        System.out.println(uid);
        System.out.println("-----------------"+tangService.queryDmsmById(uid));
        return tangService.queryDmsmById(uid);
    }

    @RequestMapping("/updateByUserId")
    @ResponseBody
    public Object updateByUserId(Integer uid, TangNiaon tangNiaon){
        tangNiaon.setRecordId(uid);
        Map<String,Object> map=new HashMap<String,Object>();
        int num=tangService.updateByUserId(tangNiaon);
        if(num>0){
            map.put("msg","success");
            map.put("info","修改成功");
        }else{
            map.put("msg","error");
            map.put("info","修改失败");
        }
        return map;
    }

    @RequestMapping("querySuiById")
    @ResponseBody
    public Object querySui(Integer uid){
        List<Tang> list = tangService.querySuiById(uid);
        return list;
    }
int sid=0;
    @RequestMapping("insertSui")
    @ResponseBody
    public Object insertSui(Integer rid,Tang tang){
       Date date= new Date();
       SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
       String d=sim.format(date);
        System.out.println("获取当前时间"+d);
       tang.setRecordId(rid);//用户ID
        tang.setHypertenState(1);//糖尿病是1
        tang.setHypertenDe(d);
        int num=tangService.insertSui(tang);
        if (num>0){
            sid=tangService.querySuiMax();
        }
        return  num;
    }

    @RequestMapping("insertRecipe")
    @ResponseBody
    public Object insertRecipe(String recordRecipeName,String recordRecipeContent, String recordRecipePian){
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("hypertenId",sid);
        map.put("recordRecipeName",recordRecipeName);
        map.put("recordRecipeContent",recordRecipeContent);
        map.put("recordRecipePian",recordRecipePian);
        int num=tangService.insertHyperYao(map);
//            Map<String,Object> ret = new HashMap<String,Object>();
//            if(num>1){}
        return num;
    }

    @RequestMapping("delSui")
    @ResponseBody
    public Object delSui(String ids){
        Map<String, String> ret = new HashMap<String, String>();
        if (StringUtils.isEmpty(ids)) {
            ret.put("type", "error");
            ret.put("msg", "请选择需要删除的数据，后端未收到");
            return ret;
        }
        if (ids.contains(",")) {
            ids = ids.substring(0, ids.length() - 1);
        }
        System.out.println("------"+ids);
        if (tangService.delSui(ids) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "删除失败，请联系管理员处理");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "删除成功！");
        return ret;
    }
    @RequestMapping("querySuiFangById")
    @ResponseBody
    public Object querySuiFangById(Integer hid){
        Tang tang=tangService.querySuiFangById(hid);
        return tang;
    }

    @RequestMapping("updateSuiFangById")
    @ResponseBody
    public Object updateSuiFangById(Integer hid,Tang tang){
        tang.setHypertenId(hid);
        //System.out.println(hid);
       // System.out.println("备注"+tang.getHypertenRemark());
        int num=tangService.updateSuiFangById(tang);
        //int num=1;
        return num;
    }

    @RequestMapping("queryYao")
    @ResponseBody
    public Object queryYao(Integer hid){
        List<Map<String,Object>> list = tangService.queryYao(hid);
        return list;
    }
}
