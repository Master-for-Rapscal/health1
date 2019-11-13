package com.aaa.health;

import com.aaa.health.util.GlobalVariable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * 1.引入springSecurity
 * 2.编写Springsecurity配置类
 *   @EnableWebSecurity extends WebSecurityConfigurerAdapter
 * 3.控制请求的访问权限
 */

@SpringBootApplication
@EnableConfigurationProperties({GlobalVariable.class})
public class Health1Application {

	public static void main(String[] args) {
		SpringApplication.run(Health1Application.class, args);

	}

}
