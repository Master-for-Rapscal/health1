package com.aaa.health.interceptor;

import com.aaa.health.entity.admin.SysUser;
import com.aaa.health.service.admin.RoleService;
import com.aaa.health.service.admin.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MyUserDetailsServer implements UserDetailsService {

    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        System.out.println("MyUserdetailsServer接受用户信息" + username);
        SysUser user = userService.findByUsername(username);
        System.out.println(user);
        if (user == null) {
            throw new UsernameNotFoundException("用户不存在");
        }
        // 添加 用户 拥有的 多个角色
        System.out.println("MyUserdetailsServer发现该用户为"+roleService.find(user.getRoleId()).getName());
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        System.out.println(user.getId());
       // System.out.println(roleService.find(user.getId()).getName());

        grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_" + roleService.find(user.getRoleId()).getName()));

        return new User(
                user.getUsername(),
                new BCryptPasswordEncoder().encode(user.getPassword()),// 数据库中密码没加密，需加密
                grantedAuthorities
        );

    }

}
