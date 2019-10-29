package com.aaa.health.controller.hypertension;

import com.aaa.health.page.admin.Page;
import com.aaa.health.service.hypertension.HypertensionService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/hypertension")
public class HypertensionController {
    @Resource
    private HypertensionService hypertensionService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String goHy(){
        return "hypertension/list";
    }

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    @ResponseBody
    public Object queryHy(Page page){
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();

        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", hypertensionService.queryAll(queryMap));
        ret.put("total", hypertensionService.queryTotal(queryMap));

        System.out.println(ret);
        return ret;
    }

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
        if (hypertensionService.deleteById(ids) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "删除用户数据失败！");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "删除成功！");
        return ret;
    }


    // 查询不是g高血压患者的信息
    @RequestMapping( "/userList")
    @ResponseBody
    public Object queryAllUser(Page page){

        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        System.out.println("aaaa"+page.getOffset());
        System.out.println("bbb"+page.getRows());
        System.out.println("---------------"+ hypertensionService.queryUserTotal(queryMap));
        ret.put("rows", hypertensionService.queryAllUser(queryMap));// 页面加载数据使用
        ret.put("total", hypertensionService.queryUserTotal(queryMap));// 分页使用
        System.out.println(ret);
        return ret;
    }
}
