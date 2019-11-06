package com.aaa.health.controller.hyper;

import com.aaa.health.entity.hyper.HyPer;
import com.aaa.health.entity.hyper.HyPerTend;
import com.aaa.health.entity.tangniaon.Tang;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.hyper.HyPerService;
import com.aaa.health.service.tangniaon.TangService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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

    @InitBinder
    protected  void  init(WebDataBinder binder){
        SimpleDateFormat dataFormate=new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class,new CustomDateEditor(dataFormate,true));
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String goHy(HttpServletRequest request){
        request.getSession().setAttribute("ltf",tangService.queryDoctor());
        request.getSession().setAttribute("area",hyPerService.queryArea());
        return "hyper/list";
    }

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    @ResponseBody
    public Object queryHy(Page page){
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
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
    public Object queryList(Page page){
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
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
        HyPer hyPer = hyPerService.queryHyById(userId);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("hyper",hyPer);
        return  map;
    }

    @RequestMapping("updateByUserId")
    @ResponseBody
    public Object updateByUserId(Integer uid,HyPer hyPer){
        hyPer.setRecordId(uid);
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
    public String ge(){
        return "common/Test";
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
        //int num=1;
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
        int num=hyPerService.updateZhuan(map);
        return num;
    }


}