package com.aaa.health.controller.admin;


import com.aaa.health.entity.area.Area;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.admin.AreaService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 菜单管理控制层
 *
 * @author llq
 */
@RequestMapping("/admin/area")
@Controller
public class AreaController {

    @Autowired
    private AreaService areaService;


    /**
     * 跳转到日志信息页面，带日志信息
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model,
                       @RequestParam(name = "_mid", required = false, defaultValue = "") String _mid) {
        model.addAttribute("topList", areaService.findTopList());

        return "area/list";
    }

    /**
     * 获取日志信息列表数据
     *
     * @param page
     * @param name
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getAreaList(Page page,
                                           @RequestParam(name = "areaName", required = false, defaultValue = "") String areaName
    ) {

        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        queryMap.put("areaName", areaName);
        List<Area> findList = areaService.findList(queryMap);
        ret.put("rows", findList);

        ret.put("total", areaService.getTotal(queryMap));

        return ret;
    }


    /**
     * 添加菜单方法
     *
     * @param Area
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> add(Area area) {
        Map<String, String> ret = new HashMap<String, String>();
        if (area == null) {
            ret.put("type", "error");
            ret.put("msg", "后台未收到菜单信息，请联系管理员添加！");
            return ret;
        }

        if (area.getParentId() == null) {
           area.setParentId(01);
        }
        if (areaService.add(area) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "添加菜单失败！");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "获取菜单成功！");
        return ret;
    }

    /**
     * 修改菜单方法
     *
     * @param Area
     * @return
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> edit(Area area) {
        Map<String, String> ret = new HashMap<String, String>();
        if (area == null) {
            ret.put("type", "error");
            ret.put("msg", "后台未收到菜单信息，请联系管理员添加！");
            return ret;
        }
        System.out.println("编辑— 获取的信息"+area);
        if (StringUtils.isEmpty(area.getAreaName())) {
            ret.put("type", "error");
            ret.put("msg", "获取菜单名称失败！");
            return ret;
        }
        if (area.getParentId() == null) {
            area.setParentId(01);
        }
        if (areaService.edit(area) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "修改菜单失败");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "修改菜单成功");
        return ret;
    }

    /**
     * 删除菜单
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> delete(
            @RequestParam(name = "id", required = true) Long id
    ) {

        Map<String, String> ret = new HashMap<String, String>();
        if (id == null) {
            ret.put("type", "error");
            ret.put("msg", "后台“菜单id”获取失败！");
            return ret;
        }

        if (areaService.delete(id) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "删除菜单信息失败！");
            return ret;
        }

        ret.put("type", "success");
        ret.put("msg", "删除菜单信息成功！");
        return ret;
    }
}
