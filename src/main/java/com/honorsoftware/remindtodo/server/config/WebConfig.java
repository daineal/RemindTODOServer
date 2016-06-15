package com.honorsoftware.remindtodo.server.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan("com.honorsoftware.remindtodo.server")
public class WebConfig extends WebMvcConfigurerAdapter {
}