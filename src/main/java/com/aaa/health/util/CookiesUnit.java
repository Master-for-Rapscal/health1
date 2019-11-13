package com.aaa.health.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

public  class CookiesUnit {
    public static  HttpServletRequest request;
    public static  HttpServletResponse response;



    public static void setCookies(String Key, String Value){
        Cookie cookie=new Cookie(Key,Value);
        cookie.setPath("/");
        response.addCookie(cookie);
    }


    public static  String getCookies(String CookiName){
        //HttpServletRequest 装请求信息类
        //HttpServletRespionse 装相应信息的类
        //   Cookie cookie=new Cookie("sessionId","CookieTestInfo");
        Cookie[] cookies =  request.getCookies();
        if(cookies != null){
            for(Cookie cookie : cookies){
                if(cookie.getName().equals(CookiName)){
                    return cookie.getValue();
                }
            }
        }

        return  null;
    }


    public  static void delCookies(String name) {
        Cookie cookie = new Cookie(name, null);
        cookie.setPath("/");
        cookie.setMaxAge(0);
        response.addCookie(cookie);
    }
}
