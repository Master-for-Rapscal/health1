package com.aaa.health.interceptor;

import com.aaa.health.interceptor.admin.UnauthorizedEntryPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;


@EnableWebSecurity
public class LoginSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private MyUserDetailsServer userDetailsService;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //定制请求的授权规则
        http.exceptionHandling().authenticationEntryPoint(new UnauthorizedEntryPoint());
        http.authorizeRequests()
                .antMatchers("/admin/**","/role/list", "/system/login","/system/box", "/system/get_cpacha").permitAll()
                .anyRequest()//任何请求
                .authenticated();//都需要身份验证
        //开启自动配置的登录功能，如果没有登录就去登录页面
        http.formLogin().loginProcessingUrl("/login").permitAll()
               .loginProcessingUrl("/system/login")//自定义 登录frome表单里的action路径
                .successForwardUrl("/system/box")//登陆成功后无法跳转到指定页面 ,不定义的话就是默认页面
                .permitAll();
        //开启记住我功能
        http.rememberMe().rememberMeParameter("remember-me")
                .userDetailsService(userDetailsService) // 设置userDetailsService
                .tokenRepository(persistentTokenRepository())//设置操作表的Repository,设置数据访问层
                .tokenValiditySeconds(60 * 60 * 24 * 7) // 记住我的时间(秒)
                .rememberMeCookieName("remember");
        //ifrom 可以添加文件
        http.headers().frameOptions().sameOrigin();
        //开启自动配置的注销功能
        http
                .logout()
                .logoutSuccessUrl("/system/login")
                .clearAuthentication(true)
                .invalidateHttpSession(false).deleteCookies("areaId")
                .deleteCookies("remember")
                .deleteCookies("areaId");
//                .deleteCookies("remember");

        http //session管理
                .sessionManagement()
                .maximumSessions(4).maxSessionsPreventsLogin(true).expiredUrl("/system/login");//设置一个用户允许登录的个数    maxSessionsPreventsLogin 启用超出报错。

        //
        http.csrf().disable();
    }

    @Autowired
    private DataSource dataSource;

    @Bean
    public PersistentTokenRepository persistentTokenRepository() {
        JdbcTokenRepositoryImpl tokenRepository = new JdbcTokenRepositoryImpl();
        tokenRepository.setDataSource(dataSource);
        // 第一次启动的时候自动建表（可以不用这句话，自己手动建表，源码中有语句的）
        // tokenRepository.setCreateTableOnStartup(true);
        return tokenRepository;

    }



}
