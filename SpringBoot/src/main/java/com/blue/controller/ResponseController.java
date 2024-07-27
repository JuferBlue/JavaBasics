package com.blue.controller;

import com.blue.pojo.Address;
import com.blue.pojo.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: com.blue.controller
 * @Author: JuferBlue
 * @CreateTime: 2024-07-27  23:34
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
public class ResponseController {
    //实体类返回json
    @RequestMapping("/getStudent")
    public Student getStudent(){
        Address address = new Address("北京", "北京");
        Student blue = new Student("Blue", 18, address);
        return blue;
    }
    //字符串返回字符串
    @RequestMapping("/getString")
    public String getString(){
        return "Hello World";
    }


}
