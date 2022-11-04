package com.ilp.Laboratorio02.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("aldair")
                .password("{noop}123")
                .roles("ADMIN","USER")
                .and()
                .withUser("flor")
                .password("{noop}123")
                .roles("USER")
                .and()
                .withUser("liz")
                .password("{noop}1234")
                .roles("USER");

    }
    }