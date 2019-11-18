package com.aaa.health.controller.common;


import com.aaa.health.entity.zzh.Healthcheck;
import com.aaa.health.entity.zzh.Userinfo;
import com.aaa.health.service.hostpit.HostService;
import com.aaa.health.service.tangniaon.TangService;
import com.aaa.health.service.zzh.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/out")
public class OutController {

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @Autowired
    public UserinfoService userinfoService;
    @Autowired
    private HostService hostService;
    @Autowired
    private TangService tangService;


    @CrossOrigin(value="*")
    @RequestMapping(value = "/findUser", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getList( HttpServletRequest request,
                                       @RequestParam(name = "userId", required = false)  Long userId,
                                       @RequestParam(name = "recordName", required = false, defaultValue = "")  String recordName,
                                       @RequestParam(name = "userIdnumber", required = false, defaultValue = "")  String userIdnumber,
                                       @RequestParam(name = "recordUnit", required = false, defaultValue = "-1")  int recordUnit,
                                       @RequestParam(name = "recordPlaceadress", required = false, defaultValue = "")  String recordPlaceadress,
                                       @RequestParam(name = "userSex", required = false, defaultValue = "-1")  Integer userSex
    ) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("userId",userId);
        queryMap.put("recordName",recordName);
        queryMap.put("userIdnumber",userIdnumber);
        queryMap.put("recordUnit",recordUnit);
        queryMap.put("recordPlaceadress",recordPlaceadress);
        queryMap.put("userSex",userSex);
       if (userinfoService.findList(queryMap).size()<=0){
        ret.put("type","error");
        ret.put("rows", "null");
        return ret;
    }
        ret.put("type","success");
        ret.put("rows", userinfoService.findList(queryMap));
        return ret;
    }

    @CrossOrigin(value = "*")//
    @RequestMapping(value = "/queryArea", method = RequestMethod.POST)
    @ResponseBody
    public Object queryArea(){
        List<Map<String,Object>> list =  hostService.queryArea();
        return list;
    }

    @CrossOrigin(value = "*")//
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    @ResponseBody
    public Object insertUserInfo(Userinfo userinfo){
        Map<String,Object> map=new HashMap<String,Object>();
        int num = hostService.addUserInfo(userinfo);
        if(num>0){
            map.put("type", "success");
            map.put("msg", "用户添加成功！");

        }else{
            map.put("type", "error");
            map.put("msg", "用户添加失败");
        }

        return map;
    }

    @CrossOrigin(value = "*")
    @RequestMapping(value = "/queryDoctor", method = RequestMethod.POST)
    @ResponseBody//查询医生
    public Object queryDocetor(){
        List<Map> list = tangService.queryDoctor();
        System.out.println(list);
        return list;
    }

    @CrossOrigin(value = "*")
    @RequestMapping(value = "/queryCheck", method = RequestMethod.POST)
    @ResponseBody//根据用户名  身份证号查询用户体检情况
    public Object queryCheck(String username,String IDnumber){
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("recordName",username);
        map.put("userIdnumber",IDnumber);
        List<Healthcheck> list = hostService.queryCheck(map);
        int num=list.size();
        return list.get(num-1);
    }

    @CrossOrigin(value = "*")
    @RequestMapping(value = "queryIDnumberTotal", method = RequestMethod.POST)
    @ResponseBody
    public Object queryIdNumberTotal(String userIdnumber){
        Integer num = userinfoService.queryIDnumberTotal(userIdnumber);
        if(num>0){
            return false;
        }
        return true;
    }
    @CrossOrigin(value = "*")
    @RequestMapping(value = "AddUser", method = RequestMethod.POST)
    @ResponseBody
    public Object AddUser(String recordName,String userMyphone,String userIdnumber){
        Map map=new HashMap();
        map.put("recordUnit",410000);
        map.put("recordAdress","莫伊");
        map.put("recordPlaceadress","00");
        map.put("recordData","2019-11-06");
        map.put("recordPostalcode","1");
        map.put("recordResident",1);
        map.put("recordBookbuilding",1);
        map.put("recordName",recordName);
        map.put("userMyphone",userMyphone);
        map.put("userIdnumber",userIdnumber);
        return map;
    }
}
