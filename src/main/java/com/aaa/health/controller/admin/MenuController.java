package com.aaa.health.controller.admin;

import java.io.File;
import java.lang.management.GarbageCollectorMXBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.aaa.health.util.GlobalVariable;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.aaa.health.entity.admin.Menu;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.admin.MenuService;

/**
 * 菜单管理控制层
 *
 * @author llq
 */
@RequestMapping("/admin/menu")
@Controller
public class MenuController {

    @Autowired
    private  GlobalVariable globalVariable;

    @Autowired
    private MenuService menuService;


    /**
     * 跳转到日志信息页面，带日志信息
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model,
                       @RequestParam(name = "_mid", required = false, defaultValue = "") String _mid) {
        model.addAttribute("topList", menuService.findTopList());

        return "menu/list";
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
    public Map<String, Object> getMenuList(Page page,
                                           @RequestParam(name = "name", required = false, defaultValue = "") String name
    ) {

        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        queryMap.put("name", name);
        List<Menu> findList = menuService.findList(queryMap);
        ret.put("rows", findList);

        ret.put("total", menuService.getTotal(queryMap));

        return ret;
    }

    /**
     * 获取全部图标方法
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/get_icons", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getIconList(HttpServletRequest request) {
        Map<String, Object> ret = new HashMap<String, Object>();
        String realPath = System.getProperty("user.dir");
        File file = new File(realPath + "\\src\\main\\resources\\public\\admin\\easyui\\css\\icons");
        List<String> icons = new ArrayList<String>();
        if (!file.exists()) {
            ret.put("type", "error");
            ret.put("msg", "获取图标方法失败");
            return ret;
        }
        File[] listFiles = file.listFiles();
        for (File f : listFiles) {
            if (f != null && f.getName().contains("png")) {
                icons.add("icon-" + f.getName().substring(0, f.getName().indexOf(".")).replace("_", "-"));
            }
        }

        ret.put("type", "success");
        ret.put("content", icons);
        return ret;
    }

    /**
     * 添加菜单方法
     *
     * @param menu
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> add(Menu menu) {
        Map<String, String> ret = new HashMap<String, String>();
        if (menu == null) {
            ret.put("type", "error");
            ret.put("msg", "后台未收到菜单信息，请联系管理员添加！");
            return ret;
        }
        if (StringUtils.isEmpty(menu.getName())) {
            ret.put("type", "error");
            ret.put("msg", "获取菜单名称失败！");
            return ret;
        }
        if (StringUtils.isEmpty(menu.getIcon())) {
            ret.put("type", "error");
            ret.put("msg", "获取菜单图标失败！");
            return ret;
        }
        if (menu.getParentId() == null) {
            menu.setParentId(0l);
        }
        if (menuService.add(menu) <= 0) {
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
     * @param menu
     * @return
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> edit(Menu menu) {
        Map<String, String> ret = new HashMap<String, String>();
        if (menu == null) {
            ret.put("type", "error");
            ret.put("msg", "后台未收到菜单信息，请联系管理员添加！");
            return ret;
        }
        if (StringUtils.isEmpty(menu.getName())) {
            ret.put("type", "error");
            ret.put("msg", "获取菜单名称失败！");
            return ret;
        }
        if (StringUtils.isEmpty(menu.getIcon())) {
            ret.put("type", "error");
            ret.put("msg", "获取菜单图标失败！");
            return ret;
        }
        if (menu.getParentId() == null) {
            menu.setParentId(0l);
        }
        if (menuService.edit(menu) <= 0) {
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
        List<Menu> findChildernList = menuService.findChildernList(id);
        if (findChildernList != null && findChildernList.size() > 0) {
            //判断该菜单是否存在
            ret.put("type", "error");
            ret.put("msg", "该菜单已删除！");
            return ret;
        }
        if (menuService.delete(id) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "删除菜单信息失败！");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "删除菜单信息成功！");
        return ret;
    }
}
