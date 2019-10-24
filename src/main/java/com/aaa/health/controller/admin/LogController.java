package com.aaa.health.controller.admin;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.aaa.health.entity.admin.Log;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.admin.LogService;

/**
 * 日志操作控制层
 *
 * @author llq
 */
@RequestMapping("/admin/log")
@Controller
public class LogController {
    @Autowired
    private LogService logService;

    /**
     * 进入日志列表页面
     *
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list() {
        return "log/list";
    }

    /**
     * 获取日志列表信息
     *
     * @param page
     * @param content
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page,
                                       @RequestParam(name = "content", required = false, defaultValue = "") String content
    ) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("content", content);
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("rows", logService.findList(queryMap));
        ret.put("total", logService.getTotal(queryMap));
        return ret;
    }

    /**
     * 获取日志列表传到首页信息
     *
     * @param log
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> add(Log log) {
        Map<String, String> ret = new HashMap<String, String>();
        if (log == null) {
            ret.put("type", "error");
            ret.put("msg", "后台未收到日志信息，请联系管理员处理");
            return ret;
        }
        if (StringUtils.isEmpty(log.getContent())) {
            ret.put("type", "error");
            ret.put("msg", "请输入完整的日志信息");
            return ret;
        }
        log.setCreateTime(new Date());
        if (logService.add(log) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "日志添加失败，请联系管理员");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "日志添加成功！");
        return ret;
    }


    /**
     * 删除日志操作
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
            ret.put("msg", "请选择需要删除的数据，后端未收到");
            return ret;
        }
        if (ids.contains(",")) {
            ids = ids.substring(0, ids.length() - 1);
        }
        if (logService.delete(ids) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "日志删除失败，请联系管理员处理");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "日志删除成功！");
        return ret;
    }


}
