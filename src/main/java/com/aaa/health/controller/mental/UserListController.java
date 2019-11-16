package com.aaa.health.controller.mental;


import com.aaa.health.entity.mental.mentalMessage;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.mental.UserListService;
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

@RequestMapping("/UserList")
@Controller
public class UserListController {
    @Autowired
    private UserListService userListService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        Map<String, Object> queryMap = new HashMap<String, Object>();
        model.addAttribute("roleList", userListService.findList(queryMap));
        return "mental/list";
    }

    /**
     * 添加用户方法
     *
     * @param
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Object add(mentalMessage mentalMessage) {


        return userListService.add(mentalMessage);
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page, @RequestParam(name = "recordInputtingcard", required = false, defaultValue = "") String recordInputtingcard,
                                       @RequestParam(name = "recordName2", required = false, defaultValue = "") String recordName2,
                                       @RequestParam(name = "recordAdress1", required = false, defaultValue = "") String recordAdress1,
                                       @RequestParam(name = "userMyphone", required = false, defaultValue = "") String userMyphone,
                                       @RequestParam(name = "userBirthday1", required = false, defaultValue = "") String userBirthday1
                                       , HttpServletRequest request) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        int areaId= Integer.parseInt((String)request.getSession().getAttribute("areaId"));
        System.out.println("登录的值是"+areaId);
        queryMap.put("areaId",areaId);
        queryMap.put("recordName",recordName2);
        queryMap.put("recordAdress",recordAdress1);
        queryMap.put("userMyphone",userMyphone);
        queryMap.put("userBirthday",userBirthday1);
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", userListService.findList(queryMap));
        ret.put("total", userListService.getTotal(queryMap));
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
        if (userListService.delete(ids) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "删除用户数据失败！");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "删除成功！");
        return ret;
    }



/**
 *修改查询
 */
@RequestMapping(value = "/findByid",method = RequestMethod.POST)
@ResponseBody
public Object selectById(long followRecordsid){
    System.out.println("ByID:::::::"+userListService.findBymentalMessage(followRecordsid));


    List list=userListService.findBymentalMessage(followRecordsid);

    return list;
}

    /**
     * 修改用户信息
     *
     * @param
     * @return
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @ResponseBody
    public Object edit(mentalMessage mentalMessage) {
        return userListService.edit(mentalMessage);
    }


}