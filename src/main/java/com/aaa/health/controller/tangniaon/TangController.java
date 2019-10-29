package com.aaa.health.controller.tangniaon;

import com.aaa.health.page.admin.Page;
import com.aaa.health.service.tangniaon.TangService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/tang")
public class TangController {
    @Resource
    private TangService tangService;
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String goTang(){
        return "tangniaon/list";
    }

    @RequestMapping(value = "list", method = RequestMethod.POST)
    @ResponseBody
    public Object queryAll(Page page){
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", tangService.queryAll(queryMap));// 页面加载数据使用
        ret.put("total", tangService.queryTotal(queryMap));// 分页使用
        System.out.println(ret);
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
    public Object queryAllUser(Page page){

        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
       // System.out.println("aaaa"+page.getOffset());
       // System.out.println("bbb"+page.getRows());
     //   System.out.println("---------------"+ tangService.queryUserTotal(queryMap));
        ret.put("rows", tangService.queryAllUser(queryMap));// 页面加载数据使用
        ret.put("total", tangService.queryUserTotal(queryMap));// 分页使用
        //System.out.println(ret);
        return ret;
    }

    //根据用户ID来查询
    @RequestMapping( "/queryById")
    @ResponseBody
    public Object queryById( Integer uid){
        System.out.println(tangService.queryUserById(uid));
        return tangService.queryUserById(uid);
    }
}
