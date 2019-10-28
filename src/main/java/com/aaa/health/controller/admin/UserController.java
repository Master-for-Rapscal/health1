package com.aaa.health.controller.admin;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.aaa.health.entity.admin.SysUser;
import com.aaa.health.page.admin.Page;
import com.aaa.health.service.admin.RoleService;
import com.aaa.health.service.admin.UserService;

/**
 * 用户管理控制层
 *
 * @author llq
 */
@RequestMapping("/admin/user")
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

    /**
     * 跳转到用户页面
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        Map<String, Object> queryMap = new HashMap<String, Object>();
        model.addAttribute("roleList", roleService.findList(queryMap));
        return "user/list";
    }

    /**
     * 获取用户信息列表
     *
     * @param page
     * @param username
     * @param roleId
     * @param sex
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getList(Page page,
                                       @RequestParam(name = "username", required = false, defaultValue = "") String username,
                                       @RequestParam(name = "roleId", required = false) Long roleId,
                                       @RequestParam(name = "sex", required = false) Integer sex
    ) {
        Map<String, Object> ret = new HashMap<String, Object>();
        Map<String, Object> queryMap = new HashMap<String, Object>();
        queryMap.put("username", username);
        queryMap.put("roleId", roleId);
        queryMap.put("sex", sex);
        queryMap.put("offset", page.getOffset());
        queryMap.put("pageSize", page.getRows());
        ret.put("roleList", roleService.findList(queryMap));
       // System.out.println(roleService.findList(queryMap));
        ret.put("rows", userService.findList(queryMap));
        ret.put("total", userService.getTotal(queryMap));
        return ret;
    }

    /**
     * 添加用户方法
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> add(SysUser user) {
        Map<String, String> ret = new HashMap<String, String>();
        if (user == null) {
            ret.put("type", "error");
            ret.put("msg", "后台获取用户信息失败！");
            return ret;
        }
        if (StringUtils.isEmpty(user.getUsername())) {
            ret.put("type", "error");
            ret.put("msg", "后台获取添加用户名失败！");
            return ret;
        }
        if (StringUtils.isEmpty(user.getPassword())) {
            ret.put("type", "error");
            ret.put("msg", "后台获取添加用户密码失败！");
            return ret;
        }
        if (user.getRoleId() == null) {
            ret.put("type", "error");
            ret.put("msg", "后台获取拥挤角色失败");
            return ret;
        }
        if (isExist(user.getUsername(), 0l)) {
            ret.put("type", "error");
            ret.put("msg", "该用户名已存在！");
            return ret;
        }
        if (userService.add(user) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "添加用户信息失败，请联系管理员！");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "用户添加失败！");
        return ret;
    }

    /**
     * 修改用户信息
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> edit(SysUser user) {
        Map<String, String> ret = new HashMap<String, String>();
        if (user == null) {
            ret.put("type", "error");
            ret.put("msg", "后台获取用户信息失败！");
            return ret;
        }
        if (StringUtils.isEmpty(user.getUsername())) {
            ret.put("type", "error");
            ret.put("msg", "后台获取用户名失败！");
            return ret;
        }
//		if(StringUtils.isEmpty(user.getPassword())){
//			ret.put("type", "error");
//			ret.put("msg", "该函数不能修改密码！");
//			return ret;
//		}
        if (user.getRoleId() == null) {
            ret.put("type", "error");
            ret.put("msg", "后台获取用户角色失败！");
            return ret;
        }
        if (isExist(user.getUsername(), user.getId())) {
            ret.put("type", "error");
            ret.put("msg", "该用户名已存在，请更换用户名！");
            return ret;
        }
        if (userService.edit(user) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "用户信息修改失败，请联系管理员！");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "用户修改成功！");
        return ret;
    }

    /**
     * 删除用户！
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
        if (userService.delete(ids) <= 0) {
            ret.put("type", "error");
            ret.put("msg", "删除用户数据失败！");
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "删除成功！");
        return ret;
    }

    /**
     * 上传头像方法
     *
     * @param photo
     * @param request
     * @return
     */
    @RequestMapping(value = "/upload_photo", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> uploadPhoto(MultipartFile photo, HttpServletRequest request) {
        Map<String, String> ret = new HashMap<String, String>();
        if (photo == null) {
            ret.put("type", "error");
            ret.put("msg", "后台获取图片信息失败！");
            return ret;
        }
        if (photo.getSize() > 1024 * 1024 * 1024) {
            ret.put("type", "error");
            ret.put("msg", "图片内存太大，请更换图片");
            return ret;
        }
        //获取上传路径
        String suffix = photo.getOriginalFilename().substring(photo.getOriginalFilename().lastIndexOf(".") + 1, photo.getOriginalFilename().length());
        if (!"jpg,jpeg,gif,png".toUpperCase().contains(suffix.toUpperCase())) {
            ret.put("type", "error");
            ret.put("msg", "上传只支持jpg,jpeg,gif,png格式，请更换图片");
            return ret;
        }
        String savePath = System.getProperty("user.dir") + "\\src\\main\\resources\\public\\admin\\upload\\";
        File savePathFile = new File(savePath);
        if (!savePathFile.exists()) {
            //图片路径不存在，创建新的路径信息
            savePathFile.mkdir();
        }
        String filename = new Date().getTime() + "." + suffix;
        try {
            //图片上传庐江
            photo.transferTo(new File(savePath + filename));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            ret.put("type", "error");
            ret.put("msg", "图片上传失败!");
            e.printStackTrace();
            return ret;
        }
        ret.put("type", "success");
        ret.put("msg", "图片上传成功");
        ret.put("filepath", "/admin/upload/"+ filename);
        return ret;
    }

    /**
     * 比对是否已存在的方法
     *
     * @param username
     * @param id
     * @return
     */
    private boolean isExist(String username, Long id) {
        SysUser user = userService.findByUsername(username);
        if (user == null) return false;
        return user.getId().longValue() != id.longValue();
    }
}
