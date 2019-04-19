package com.ansou.springsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        User.UserBuilder users = User.withDefaultPasswordEncoder();
        auth.inMemoryAuthentication()
                .withUser(users.username("Simon").password("test123").roles("Employee", "Manager"))
                .withUser(users.username("Eunju").password("test123").roles("Employee"))
                .withUser(users.username("Sohyeon").password("test123").roles("Employee", "Admin"));
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests()
                    .antMatchers("/").hasRole("Employee")
                    .antMatchers("/leaders/**").hasRole("Manager")
                    .antMatchers("/systems/**").hasRole("Admin")
                    .and()
                    .formLogin()
                    .loginPage("/showMyLoginPage")
                    .loginProcessingUrl("/authenticateTheUser")
                    .permitAll()
                    .and()
                    .logout().permitAll()
                    .and()
                    .exceptionHandling().accessDeniedPage("/access-denied");
    }
}
