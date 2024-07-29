package com.blue.exception;

import com.blue.pojo.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: com.blue.exception
 * @Author: JuferBlue
 * @CreateTime: 2024-07-29  15:54
 * @Description: TODO
 * @Version: 1.0
 */
@RestControllerAdvice//全局异常处理  @RestControllerAdvice = @ControllerAdvice + @ResponseBody
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)//捕获异常类型：捕获所有异常
    public Result ex(Exception ex){
        ex.printStackTrace();
        return Result.error("对不起,操作失败,请联系管理员");
    }
}
