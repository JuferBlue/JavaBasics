package com.blue.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: com.blue.pojo
 * @Author: JuferBlue
 * @CreateTime: 2024-07-28  20:54
 * @Description: TODO
 * @Version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private Integer code;//响应码 1代表成功0代表失败
    private String msg;//响应信息
    private Object data;//返回的数据

    public static Result success(){
        return new Result(1,"success",null);
    }
    public static Result success(Object data){
        return new Result(1,"success",data);
    }
    public static Result error(String s){
        return new Result(0,"error",null);
    }
}
