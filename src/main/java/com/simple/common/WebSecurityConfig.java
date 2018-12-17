package com.simple.common;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Create By S I M P L E On 2018/12/17 15:18:02
 */

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .authorizeRequests()
                .antMatchers("/", "/login")//设置Spring Security对/和/"login"路径不拦截
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .loginPage("/login")//设置SpringSecurity的登录页面为/login
                .defaultSuccessUrl("/chat")//登录成功后转向/chat路径
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }

    //在内存中分配两个用户Michael和Janet，密码都为freedom，角色都是USER
    protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder
                .inMemoryAuthentication()
                .withUser("user1").password("{noop}123123").roles("USER")
                .and()
                .withUser("user2").password("{noop} 123123").roles("USER");
    }

    // /resources/static/目录下的静态资源，Spring Security不拦截
    public void configure(WebSecurity webSecurity) throws Exception {
        webSecurity.ignoring().antMatchers("/resources/static/**");
    }

}
