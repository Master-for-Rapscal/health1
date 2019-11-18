package com.aaa.health.controller.Children;

import com.aaa.health.entity.Children.ChildTCM;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.Children.ChildTCMService;
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

@RequestMapping("/ChildTCMRecord")
@Controller
public class ChildTCMRecordController {
    @Autowired
    private ChildTCMService childTCMService;


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        Map<String, Object> queryMap = new HashMap<String, Object>();
        model.addAttribute("roleList", childTCMService.findList(queryMap));
        return "ChildrenInfo/ChildTCMlist";
    }

    /**
     * 获取用户信息列表
     *
     * @param page

     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page ) {
        System.out.println(page);
        if(page.getRows()==0){
            page.setRows(100);
        }
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", childTCMService.findList(queryMap));
        List<ChildTCM> list=childTCMService.findList(queryMap);
        for (int i=0;i<list.size();i++){
            list.get(i).setCishu(childTCMService.queryCount(list.get(i).getChmedmrenum()));
        }
        ret.put("rows", list);
        ret.put("total", childTCMService.getTotal(queryMap));
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
        if (childTCMService.delete(ids) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "删除用户数据失败！");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "删除成功！");
        return ret;
    }
}
