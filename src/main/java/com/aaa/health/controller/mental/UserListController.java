package com.aaa.health.controller.mental;

import com.aaa.health.entity.admin.SysUser;
import com.aaa.health.entity.mental.mentalMessage;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.mental.UserListService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
        //  Map<String, String> ret = new HashMap<String, String>();
        System.out.println("=============" + mentalMessage);

        return userListService.add(mentalMessage);
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();

        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", userListService.findList(queryMap));
        ret.put("total", userListService.getTotal(queryMap));

        System.out.println("弹出的数据：" + userListService.findList(queryMap));
        return ret;
    }

/**
 *修改查询
 */
@RequestMapping(value = "/findByid",method = RequestMethod.POST)
@ResponseBody
public Object selectById(long followRecordsid){
    System.out.println("ByID:::::::"+userListService.findBymentalMessage(followRecordsid));
    /*Map<String,Object> map=new HashMap<String,Object>();
    map.put("aaa",userListService.findBymentalMessage(followRecordsid));
    return map;*/

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
        System.out.println("修改成功========================================================================================================="+mentalMessage);
        return userListService.edit(mentalMessage);
    }


}