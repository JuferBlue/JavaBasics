package com.blue.aop;

import com.alibaba.fastjson.JSONObject;
import com.blue.mapper.OperateLogMapper;
import com.blue.pojo.OperateLog;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: com.blue.aop
 * @Author: JuferBlue
 * @CreateTime: 2024-07-31  19:37
 * @Description: TODO
 * @Version: 1.0
 */
@Component
@Aspect
@Slf4j
public class LogAspect {

    @Autowired
    private OperateLogMapper operateLogMapper;
    @Around("@annotation(com.blue.anno.Log)")
    public Object recordLog(ProceedingJoinPoint joinPoint) throws Throwable {
        //操作人的id 线程获取
        Integer operateUser = 1;
        //操作时间
        LocalDateTime operateTime = LocalDateTime.now();

        //操作类名
        String className = joinPoint.getTarget().getClass().getName();
        //操作方法名
        String methodName = joinPoint.getSignature().getName();
        //操作方法参数
        Object[] args = joinPoint.getArgs();
        String methodParams = args.toString();

        long beginTime = System.currentTimeMillis();
        //调用原始目标方法运行
        Object result = joinPoint.proceed();
        long endTime = System.currentTimeMillis();

        //方法返回值
        String returnValue = JSONObject.toJSONString(result);
        //操作耗时
        Long costTime = endTime - beginTime;


        //记录操作日志
        OperateLog operateLog = new OperateLog(null,operateUser,operateTime,className,methodName,methodParams,returnValue,costTime);
        operateLogMapper.insert(operateLog);
        return result;

    }
}
