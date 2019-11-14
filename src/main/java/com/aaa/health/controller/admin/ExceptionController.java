package com.aaa.health.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExceptionController {
    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public String list() {
        System.out.println("首次登录！");return "/system/login";}
    @RequestMapping(value = "/error", method = RequestMethod.POST)
    public String list2() {
        System.out.println("登录异常1！"); return "/system/login";}

     @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String list3() {
        System.out.println("登录异常3！");return "/system/login";}
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String list4(String error) {
        System.out.println("登录异常4！"); return "/system/login";}
}
