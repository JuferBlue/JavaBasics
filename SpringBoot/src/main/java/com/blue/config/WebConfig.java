package com.blue.config;

import com.blue.interceptor.LoginCheckInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: com.blue.config
 * @Author: JuferBlue
 * @CreateTime: 2024-07-29  15:29
 * @Description: TODO
 * @Version: 1.0
 */
@Configuration//配置类 @Configuration = @Component
public class WebConfig implements WebMvcConfigurer {
    @Autowired//注入拦截器
    private LoginCheckInterceptor loginCheckInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginCheckInterceptor).addPathPatterns("/**").excludePathPatterns("/login");//拦截路径和不拦截
    }
}
