package com.aaa.health.controller.Children;

import com.aaa.health.entity.Children.ChildInfo;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.Children.ChildCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RequestMapping("/ChildCard")
@Controller
public class ChildCardController {
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
    @Autowired
    private ChildCardService childCardService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        Map<String, Object> queryMap = new HashMap<String, Object>();
        model.addAttribute("roleList", childCardService.findList(queryMap));
        return "ChildrenInfo/list";
    }

    /**
     * 获取用户信息列表
     *
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page,@RequestParam(name = "recordInputtingcard", required = false, defaultValue = "") String recordInputtingcard,
                                       @RequestParam(name = "recordName1", required = false, defaultValue = "") String recordName1,
                                       @RequestParam(name = "recordAdress", required = false, defaultValue = "") String recordAdress,
                                       @RequestParam(name = "userMyphone", required = false, defaultValue = "") String userMyphone,
                                       @RequestParam(name = "userBirthday", required = false, defaultValue = "") String userBirthday
                                       , HttpServletRequest request) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        int areaId= Integer.parseInt((String)request.getSession().getAttribute("areaId"));
        queryMap.put("areaId",areaId);
        queryMap.put("recordInputtingcard",recordInputtingcard);
        queryMap.put("recordName",recordName1);
        queryMap.put("recordAdress",recordAdress);
        queryMap.put("userMyphone",userMyphone);
        queryMap.put("userBirthday",userBirthday);
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", childCardService.findList(queryMap));
        ret.put("total", childCardService.getTotal(queryMap));
        return ret;
    }

    /**
     * 添加用户方法
     *
     * @param
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Object add(ChildInfo childInfo) {

        return childCardService.add(childInfo);
    }


    /**
     *修改查询
     */
    @RequestMapping(value = "/findByid",method = RequestMethod.POST)
    @ResponseBody
    public Object selectById(long addnewbornId){

        List list=childCardService.findByChildCard(addnewbornId);
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
    public Object edit(ChildInfo childInfo) {

        return childCardService.edit(childInfo);
    }
}
