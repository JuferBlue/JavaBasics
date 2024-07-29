package com.blue.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: com.blue.interceptor
 * @Author: JuferBlue
 * @CreateTime: 2024-07-29  15:21
 * @Description: TODO
 * @Version: 1.0
 */
@Component  //要写一个注解类
public class LoginCheckInterceptor implements HandlerInterceptor {
    @Override//目标资源方法运行前运行返回true放行，false不放行
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle....");
        return true;
    }

    @Override//目标资源方法运行后运行
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle....");
    }

    @Override//视图渲染完毕后执行
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion....");
    }
}
