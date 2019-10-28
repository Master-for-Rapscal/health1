package com.aaa.health.controller.admin;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aaa.health.controller.toCamer;
import com.aaa.health.page.admin.Page;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.session.SessionInformation;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.aaa.health.entity.admin.Authority;
import com.aaa.health.entity.admin.Menu;
import com.aaa.health.entity.admin.Role;
import com.aaa.health.entity.admin.SysUser;
import com.aaa.health.service.admin.AuthorityService;
import com.aaa.health.service.admin.LogService;
import com.aaa.health.service.admin.MenuService;
import com.aaa.health.service.admin.RoleService;
import com.aaa.health.service.admin.UserService;
import com.aaa.health.util.CpachaUtil;
import com.aaa.health.util.MenuUtil;

/**
 * 系统方法
 *
 * @author llq
 */
@Controller
@RequestMapping("/system")
public class SystemController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private AuthorityService authorityService;

    @Autowired
    private MenuService menuService;

    @Autowired
    private LogService logService;

    @RequestMapping(value = "/box", method = RequestMethod.POST)
    public String index1() {

        return "/index";
    }

    /**
     * 获得主页
     * @param model
     * @return
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model, HttpServletRequest request) {
        //(String) request.getSession().getAttribute("username");
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
      //  System.out.println("security获取用户信息" + user.getUsername());
//        System.out.println("security获取用户信息" + user);
        SysUser findByUsername = userService.findByUsername(user.getUsername());
        Role role = roleService.find(findByUsername.getRoleId());
        List<Authority> authorityList = authorityService.findListByRoleId(role.getId());//���ݽ�ɫ��ȡȨ���б�
        String menuIds = "";
        for (Authority authority : authorityList) {
            menuIds += authority.getMenuId() + ",";
        }
        if (!StringUtils.isEmpty(menuIds)) {
            menuIds = menuIds.substring(0, menuIds.length() - 1);
        }
        List<Menu> userMenus = menuService.findListByIds(menuIds);
        request.getSession().setAttribute("admin", findByUsername);
        request.getSession().setAttribute("role", role);
        request.getSession().setAttribute("userMenus", userMenus);
//        System.out.println("用户所拥有的权限"+userMenus);
        model.addAttribute("topMenuList", MenuUtil.getAllTopMenu(userMenus));
        model.addAttribute("secondMenuList", MenuUtil.getAllSecondMenu(userMenus));
        System.out.println("进入登录");
        return "system/index";//WEB-INF/views/+system/index+.jsp = WEB-INF/views/system/index.jsp
    }

    /**
     * 获取欢迎页面
     * @param model
     * @return
     */
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public ModelAndView welcome(ModelAndView model) {
        model.setViewName("system/welcome");
        return model;
    }

    /**
     * get登录页面
     * @param model
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(ModelAndView model) {
        return "system/login";
    }

    /**
     * 修改密码
     * @param model
     * @return
     */
    @RequestMapping(value = "/edit_password", method = RequestMethod.GET)
    public ModelAndView editPassword(ModelAndView model) {
        model.setViewName("system/edit_password");
        return model;
    }

    @RequestMapping(value = "/edit_password", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> editPasswordAct(String newpassword, String oldpassword, HttpServletRequest request) {
        Map<String, String> ret = new HashMap<String, String>();
        if (StringUtils.isEmpty(newpassword)) {
            ret.put("type", "error");
            ret.put("msg", "新密码不能为空");
            return ret;
        }
        SysUser user = (SysUser) request.getSession().getAttribute("admin");
        if (!user.getPassword().equals(oldpassword)) {
            ret.put("type", "error");
            ret.put("msg", "原密码输入错误！");
            return ret;
        }
        user.setPassword(newpassword);
        if (userService.editPassword(user) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "密码修改失败");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "密码修改成功");
        logService.add("用户：{" + user.getUsername() + "}，修改密码成功！");
        return ret;
    }

    /**
     * 变更验证码
     *
     * @param vcodeLen
     * @param width
     * @param height
     * @param cpachaType
     * @param request
     * @param response
     */
    @RequestMapping(value = "/get_cpacha", method = RequestMethod.GET)
    public void generateCpacha(
            @RequestParam(name = "vl", required = false, defaultValue = "4") Integer vcodeLen,
            @RequestParam(name = "w", required = false, defaultValue = "100") Integer width,
            @RequestParam(name = "h", required = false, defaultValue = "30") Integer height,
            @RequestParam(name = "type", required = true, defaultValue = "loginCpacha") String cpachaType,
            HttpServletRequest request,
            HttpServletResponse response) {
        CpachaUtil cpachaUtil = new CpachaUtil(vcodeLen, width, height);
        String generatorVCode = cpachaUtil.generatorVCode();
        request.getSession().setAttribute(cpachaType, generatorVCode);
        BufferedImage generatorRotateVCodeImage = cpachaUtil.generatorRotateVCodeImage(generatorVCode, true);
        try {
            ImageIO.write(generatorRotateVCodeImage, "gif", response.getOutputStream());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/toC", method = RequestMethod.GET)
    public String toCampert() {

        return "system/list";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> getList(String info) {
        Map<String, String> ret = new HashMap<String, String>();
        System.out.println(info);
        String news = toCamer.lineToHump(info);

        ret.put("news", news);
        ret.put("type", "success");
        ret.put("msg", "用户修改成功！");
        return ret;
    }

}
