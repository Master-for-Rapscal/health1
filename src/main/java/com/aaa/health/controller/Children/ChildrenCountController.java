package com.aaa.health.controller.Children;

import com.aaa.health.page.admin.Page;
import com.aaa.health.service.Children.ChildrenCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("ChildCount")
@Controller
public class ChildrenCountController {

    @Autowired
    private ChildrenCountService childrenCountService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        Map<String, Object> queryMap = new HashMap<String, Object>();
        model.addAttribute("roleList", childrenCountService.findList(queryMap));
        return "ChildrenInfo/ChildCountlist";
    }


    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page,HttpServletRequest request) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        int areaId= Integer.parseInt((String)request.getSession().getAttribute("areaId"));
        queryMap.put("areaId",areaId);
        queryMap.put("recordUnit",areaId);
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", childrenCountService.findList(queryMap));
        ret.put("total", childrenCountService.getTotal(queryMap));
        System.out.println(
                ret
        );
        return ret;
    }

}
