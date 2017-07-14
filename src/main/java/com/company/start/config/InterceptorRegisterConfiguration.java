package com.company.start.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
//@EnableWebMvc
public class InterceptorRegisterConfiguration extends WebMvcConfigurerAdapter {
/*
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars*//**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }*/


    //静态资源路径配置
  /*  @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources*//**")
                .addResourceLocations("/resources/");
    }*/
}
