package com.aaa.health.controller.pultub;

import com.aaa.health.entity.Children.ChildInfo;
import com.aaa.health.entity.pultub.FoservPul;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.Children.ChildInfoService;
import com.aaa.health.service.pultub.FoservPulService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/FoservPul")
public class FoservPulController {
    @Autowired
    private FoservPulService foservPulService;
    @RequestMapping(value = "/findId", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page,Integer pultubfoId) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", foservPulService.findId(pultubfoId));// 页面加载数据使用
        ret.put("total", foservPulService.getTotal(queryMap));// 分页使用
        return ret;
    }
    @RequestMapping(value = "/findById", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> findById(Integer foserId) {
        //List<Map> list=new ArrayList<>();
        Map<String, Object> fo = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        System.out.println(foserId);
        System.out.println("陈情令"+foservPulService.findById(foserId));
       /* queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());*/
        fo.put("foser", foservPulService.findById(foserId));// 页面加载数据使用
        fo.put("total", foservPulService.getTotal(queryMap));// 分页使用
        System.out.println("xz"+fo);
        return fo;
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
        if (foservPulService.delete(ids) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "删除失败，请联系管理员处理");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "删除成功！");
        return ret;
    }
}

