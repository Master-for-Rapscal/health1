package com.aaa.health.controller.hyper;

import com.aaa.health.entity.hyper.HyPer;
import com.aaa.health.entity.hyper.HyPerTend;
import com.aaa.health.entity.tangniaon.Tang;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.admin.AreaService;
import com.aaa.health.service.hostpit.HostService;
import com.aaa.health.service.hyper.HyPerService;
import com.aaa.health.service.tangniaon.TangService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/hyper")
public class HyPerController {
    @Resource
    private HyPerService hyPerService;
    @Autowired
    private TangService tangService;
    @Autowired
    private AreaService areaService;
    @Autowired
    private HostService hostService;
    @InitBinder
    protected  void  init(WebDataBinder binder){
        SimpleDateFormat dataFormate=new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class,new CustomDateEditor(dataFormate,true));
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String goHy(Model model, HttpServletRequest request){
        request.getSession().setAttribute("ltf",tangService.queryDoctor());
        Long areaId=Long.parseLong((String)request.getSession().getAttribute("areaId"));
        if (areaId==410000) areaId= new Long((long)0);
        model.addAttribute("area",areaService.findChildernList(areaId));
        return "hyper/list";
    }

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    @ResponseBody
    public Object queryHy(Page page,
                          @RequestParam(name = "gui", required = false, defaultValue = "") Integer gui,
                          @RequestParam(name = "recordUnit", required = false, defaultValue = "0")Integer recordUnit,
                          @RequestParam(name = "userbian", required = false, defaultValue = "0") Integer userbian,
                          @RequestParam(name = "userMing", required = false, defaultValue = "") String userMing,
                          @RequestParam(name = "usersex", required = false, defaultValue = "0") String usersex,
                          @RequestParam(name = "userAdress", required = false, defaultValue = "") String userAdress,
                          @RequestParam(name = "userphone", required = false, defaultValue = "") String userphone,
                          @RequestParam(name = "userIdcard", required = false, defaultValue = "") String userIdcard,
                          HttpServletRequest request){
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        queryMap.put("hypertensionOutcome",gui);
        queryMap.put("userId",userbian);
        queryMap.put("recordName",userMing);
        queryMap.put("usersex",usersex);
        queryMap.put("recordAdress",userAdress);
        queryMap.put("userMyphone",userphone);
        queryMap.put("userIdnumber",userIdcard);
        int areaId= Integer.parseInt((String) request.getSession().getAttribute("areaId"));
        if(recordUnit == 0){//没传值
            if(areaId == 410000){
                areaId =0 ;
            }//最高权限
        }else {//如果传值了  就把穿的地区传入mapper
            if(recordUnit==410000){
                areaId =0 ;
            }else {
                areaId = recordUnit;
            }
        }
//        System.out.println("-------------"+areaId);
        queryMap.put("recordUnit",areaId);
        ret.put("rows", hyPerService.queryHyAll(queryMap));// 页面加载数据使用
        ret.put("total", hyPerService.queryHyTotal(queryMap));// 分页使用
        //System.out.println("高血压"+ret);
        return ret;
    }

    @RequestMapping("delete")
    @ResponseBody
    public Object deleteByIds(String ids){
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
        if (hyPerService.deleteByIds(ids) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "删除失败，请联系管理员处理");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "删除成功！");
        return ret;
    }


    @RequestMapping("userList")
    @ResponseBody
    public Object queryList(Page page,
                            @RequestParam(name = "userbianhao", required = false, defaultValue = "") String userbianhao,
                            @RequestParam(name = "userName", required = false, defaultValue = "") String userName,
                            @RequestParam(name = "userAdress", required = false, defaultValue = "") String userAdress,
                            @RequestParam(name = "username", required = false, defaultValue = "") String userPhone,
                            HttpSession session){
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        queryMap.put("userId",userbianhao);
        queryMap.put("recordName",userName);
        queryMap.put("recordAdress",userAdress);
        queryMap.put("userMyphone",userPhone);
        //----------where recordUnit=#{recordUnit}↓名
       // queryMap.put("MApper条件查询里的#{recordUnit}",session.getAttribute("登录人所在地区ID"));
        ret.put("rows", hyPerService.queryNotUser(queryMap));// 页面加载数据使用
        ret.put("total", hyPerService.queryNoUserTotal(queryMap));// 分页使用
        return ret;
    }

    @RequestMapping("inserthy")
    @ResponseBody
    public Object insertHy(Integer uid, HyPer hyPer){
        hyPer.setRecordId(uid);
        int num=hyPerService.insertHy(hyPer);
        Map<String,Object> map=new HashMap<String,Object>();
        if(num>0){
            map.put("msg","success");
            map.put("info","添加成功");
        }else{
            map.put("msg","error");
            map.put("info","添加失败,联系管理员");
        }
       // System.out.println(map);
        return map;
    }

    @RequestMapping("queryHyById")
    @ResponseBody
    public Object queryHyById(Integer userId){
        List<HyPer> list = hyPerService.queryHyById(userId);
       // Map<String,Object> map=new HashMap<String,Object>();
      //  map.put("hyper",hyPer);
        System.out.println("asdasdasdas"+list);
        return  list;
    }

    @RequestMapping("updateByUserId")
    @ResponseBody
    public Object updateByUserId(Integer uid,HyPer hyPer){
        hyPer.setRecordId(uid);
        System.out.println(hyPer);
        int num=hyPerService.updateByUserId(hyPer);

        Map<String,Object> map=new HashMap<String,Object>();
        if(num>0){
            map.put("msg","success");
            map.put("info","修改成功");
        }else{
            map.put("msg","error");
            map.put("info","修改失败,联系管理员");
        }
        return map;
    }

@RequestMapping("/Test")
    public String ge(Model model){
        model.addAttribute("diqu",hostService.queryArea());
        return "ECharts/echarts";
}

    @RequestMapping("querySuiById")
    @ResponseBody
    public Object querySui(Integer uid){
        List<Tang> list = hyPerService.querySuiById(uid);
        return list;
    }
    int sid=0;
    @RequestMapping("insertSui")
    @ResponseBody
    public Object insertSui(Integer rid,Tang tang){
        Date date= new Date();
        SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
        String d=sim.format(date);
        //System.out.println("获取当前时间"+d);
        tang.setRecordId(rid);//用户ID
        tang.setHypertenState(2);//高血压是2 糖尿病是1
        tang.setHypertenDe(d);
        int num=hyPerService.insertSui(tang);
        if (num>0){
            sid=hyPerService.querySuiMax();
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
        int num=hyPerService.insertHyperYao(map);
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
        if (hyPerService.delSui(ids) <= 0) {
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
        Tang tang=hyPerService.querySuiFangById(hid);
        return tang;
    }

    @RequestMapping("updateSuiFangById")
    @ResponseBody
    public Object updateSuiFangById(Integer hid,Tang tang){
        tang.setHypertenId(hid);
        int num=hyPerService.updateSuiFangById(tang);
        tangService.deleteYaoById(hid);
        return num;
    }

    @RequestMapping("queryYao")
    @ResponseBody
    public Object queryYao(Integer hid){
        List<Map<String,Object>> list = hyPerService.queryYao(hid);
        return list;
    }



    @RequestMapping("updateZhuan")
    @ResponseBody
    public Object updateZhuan(Integer uid,String zhuancause,Date zhuandate){
        Map<String,Object> map =new HashMap<String,Object>();
        map.put("uid",uid);
        map.put("zhuancause",zhuancause);
        map.put("zhuandate",zhuandate);
       // System.out.println("aaaaaaaa"+map);
        int num=hyPerService.updateZhuan(map);
        return num;
    }


    @RequestMapping("updateYaoById")
    @ResponseBody
    public Object updateYaoById(Integer hid,String recordRecipeName,String recordRecipeContent, String recordRecipePian){
        Map<String,Object> map=new HashMap<String,Object>();
        Map<String,Object> ret=new HashMap<String,Object>();
        map.put("hypertenId",hid);
        map.put("recordRecipeName",recordRecipeName);
        map.put("recordRecipeContent",recordRecipeContent);
        map.put("recordRecipePian",recordRecipePian);
        int num=tangService.insertYao(map);
        return num;
    }
}
