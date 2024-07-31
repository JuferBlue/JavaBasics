package com.blue.mapper;


import com.blue.pojo.OperateLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OperateLogMapper {

    @Insert("insert into operate_log(operate_user,class_name,method_name,method_params,return_value,cost_time,operate_time) values(#{operateUser},#{className},#{methodName},#{methodParams},#{returnValue},#{costTime},#{operateTime})")
    public void insert(OperateLog operateLog);
}
