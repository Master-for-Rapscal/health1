package com.aaa.health.controller.Children;

import com.aaa.health.entity.Children.ChildInfo;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.Children.ChildInfoService;
import com.fasterxml.jackson.annotation.JsonFormat;
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
import java.util.List;
import java.util.Map;

/**
 * 河南健康体检(散居儿童)2017
 */

@RequestMapping("/ChildHC")
@Controller
public class ChildHealthCheckController {
    @Autowired
    private ChildInfoService childInfoService;


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        Map<String, Object> queryMap = new HashMap<String, Object>();
        model.addAttribute("roleList", childInfoService.findList(queryMap));
        return "ChildrenInfo/ChildHClist";
    }

    /**
     * 获取用户信息列表
     *
     * @param page
     * @param
     * @param
     * @param
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page, @RequestParam(name = "recordName", required = false, defaultValue = "") String recordName
            , HttpServletRequest request) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        int areaId= Integer.parseInt((String)request.getSession().getAttribute("areaId"));
        System.out.println("登录的值是"+areaId);
        queryMap.put("areaId",areaId);
        queryMap.put("recordName",recordName);
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        List<ChildInfo>  list=childInfoService.findList(queryMap);
        for (int i=0;i<list.size();i++){
            list.get(i).setCishu(childInfoService.queryCount(list.get(i).getUserId()));

        }


        ret.put("rows", list);
        ret.put("total", childInfoService.getTotal(queryMap));


        return ret;
    }

    /**
     * 删除方法！
     *
     * @param ids
     * @return
     */
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
        if (childInfoService.delete(ids) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "删除用户数据失败！");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "删除成功！");
        return ret;
    }

}
