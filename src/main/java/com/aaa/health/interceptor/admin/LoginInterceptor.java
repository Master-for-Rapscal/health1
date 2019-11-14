package com.aaa.health.interceptor.admin;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import com.aaa.health.entity.admin.Menu;
import com.aaa.health.util.MenuUtil;

/**
 * ��̨��¼������
 *
 * @author llq
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public void afterCompletion(HttpServletRequest arg0,
                                HttpServletResponse arg1, Object arg2, Exception arg3) {
        // TODO Auto-generated method stub

    }

    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
                           Object arg2, ModelAndView arg3) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object arg2) throws IOException {
            String mid = request.getParameter("_mid");
        String uri = request.getRequestURI();//获取请求资源名
        System.out.println("拦截器数据：本次请求路径"+uri);
            List<Menu> userMenus=  ( List<Menu>) request.getSession().getAttribute("userMenus");
//            &&uri!="system/login"
        if (!uri.contains(".")){
          if (userMenus==null && !uri.equals("/system/login")&& !uri.equals("/system/box")&& !uri.equals("/system/index") ) {
              String tf="/system/login";
              response.sendRedirect(tf);

              System.out.println("拦截器数据，一重新跳转到登录页面"+uri);
//              System.out.println(uri+"拦截器数据"+userMenus.size()) ;
              return false;}

              else {
//              System.out.println(uri+"拦截器数据(lujing!=login)"+0);
          }

            if (!StringUtils.isEmpty(mid)) {
                List<Menu> allThirdMenu = MenuUtil.getAllThirdMenu(userMenus,Long.valueOf(mid));
                request.setAttribute("thirdMenuList", allThirdMenu);
            }}
         return true;
    }

}
