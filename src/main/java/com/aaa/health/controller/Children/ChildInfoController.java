package com.aaa.health.controller.Children;

import com.aaa.health.page.admin.Page;
import com.aaa.health.service.Children.ChildInfoService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/ChildInfo")
@Controller
public class ChildInfoController {

    @Autowired
    private ChildInfoService childInfoService;


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        Map<String, Object> queryMap = new HashMap<String, Object>();
        model.addAttribute("roleList", childInfoService.findList(queryMap));
        return "ChildrenInfo/list";
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
    public Map<String, Object> getList(Page page,@RequestParam(name = "recordInputtingcard", required = false, defaultValue = "") String recordInputtingcard,
                                       @RequestParam(name = "recordName", required = false, defaultValue = "") String recordName,
                                       @RequestParam(name = "userAdress", required = false, defaultValue = "") String userAdress,
                                       @RequestParam(name = "userMyphone", required = false, defaultValue = "") String userMyphone) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("recordInputtingcard",recordInputtingcard);
        queryMap.put("recordName",recordName);
        queryMap.put("recordAdress",userAdress);
        queryMap.put("userMyphone",userMyphone);
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", childInfoService.findList(queryMap));
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
