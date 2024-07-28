package com.blue.controller;

import com.blue.mybatis.PageBean;
import com.blue.pojo.Result;
import com.blue.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: com.blue.controller
 * @Author: JuferBlue
 * @CreateTime: 2024-07-28  20:44
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
public class EmpController {
    @Autowired
    private EmpService empService;
    @GetMapping("/emps")
    public Result page(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer pageSize){
        PageBean pageBean = empService.page(page,pageSize);
        return Result.success(pageBean);
    }

}
