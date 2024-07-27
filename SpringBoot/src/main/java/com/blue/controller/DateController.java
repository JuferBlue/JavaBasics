package com.blue.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: com.blue.controller
 * @Author: JuferBlue
 * @CreateTime: 2024-07-27  22:09
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
public class DateController {
    @RequestMapping("/dateParam")
    public String dataParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime date){
        System.out.println(date);
        return date.toString();
    }
}
