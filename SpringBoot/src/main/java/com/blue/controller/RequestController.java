package com.blue.controller;

import com.blue.pojo.Student;
import com.blue.pojo.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: com.blue.controller
 * @Author: JuferBlue
 * @CreateTime: 2024-07-27  21:33
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
public class RequestController {
    @RequestMapping("/simpleParamA")
    //请求参数名与形参相同可以直接这样写
    public String simpleParamA(String name, int age) {
        System.out.println("name=" + name + " age=" + age);
        return "name=" + name + " age=" + age;
    }

    @RequestMapping("/simpleParamB")
    //请求参数名与形参不相同需要使用@RequestParam注解
    public String simpleParamB(@RequestParam("username") String name, int age) {
        System.out.println("name=" + name + " age=" + age);
        return "name=" + name + " age=" + age;
    }

    //将请求直接封装到对象中
    @RequestMapping("/simpleParamC")
    public String simpleParamC(User user) {
        System.out.println("name=" + user.getName() + " age=" + user.getAge());
        return user+"";
    }

    //接受数组参数
    @RequestMapping("/simpleParamD")
    public String simpleParamD(String[] hobby) {
        System.out.println("hobby=" + hobby);
        return "hobby=" + Arrays.toString(hobby);
    }

    //封装到集合中,要加@RequestParam注解
    @RequestMapping("/simpleParamE")
    public String simpleParamE(@RequestParam List<String> hobby) {
        System.out.println("hobby=" + hobby);
        return "hobby=" + hobby;
    }

    //接收json数据,要加@RequestBody注解
    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody Student student) {
        System.out.println("student=" + student);
        return "student=" + student;
    }
}
