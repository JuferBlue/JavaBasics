package com.blue.aop;

import lombok.extern.apachecommons.CommonsLog;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: com.blue.aop
 * @Author: JuferBlue
 * @CreateTime: 2024-07-31  16:50
 * @Description: TODO
 * @Version: 1.0
 */
@Slf4j
@Component//交给aoc容器管理
@Aspect //标明这是一个切面类
@Order(1)
public class TimeAspect {
    //第一个*：表示所有的类或接口
    //第二个*：表示所有的方法

    //连接点：JointPoint 可以被aop控制的方法
    //通知：Advice 指重复的逻辑，也就是共性方法
    //切入点：PointCut 实际被切入的方法
    //切面：Aspect 切入点+通知
    //目标对象：Target 通知所应用的对象
    @Around("execution(* com.blue.controller.*.*(..))")//切入点表达式
    public Object recordTime(ProceedingJoinPoint joinPoint) throws Throwable {
        //1.记录开始时间
        long bengin = System.currentTimeMillis();
        //2.调用原始方法运行
        Object result = joinPoint.proceed();//这是原始方法的返回值，一定要将它返回回去
        //3.记录结束时间，计算方法执行耗时
        long end = System.currentTimeMillis();
        log.info(joinPoint.getSignature()+"方法执行耗时：" + (end - bengin));

        return result;
    }

    //通知类型
    //1.@Around：环绕通知,此注解标注的方法会在目标方法前后运行
    //2.@Before：前置通知，在目标方法运行前运行
    //3.@After：后置通知，在目标方法运行后运行，即使目标方法抛出异常也会运行
    //4.@AfterReturning：返回通知，在目标方法正常返回后运行
    //5.@AfterThrowing：异常通知，在目标方法抛出异常后运行

    @Before("execution(* com.blue.controller.*.*(..))")
    public void befor(){
        log.info("befor");
    }

    //统一维护切点表达式
    @Pointcut("execution(* com.blue.controller.*.*(..))")
    private void pt(){} //空方法
    @Before("pt()")
    public void  gg(){
        log.info("befor");
    }
    //通知的执行顺序
    //1.前置通知：字母排名前的先执行
    //2.后置通知，字母排名后的先执行
    //可以在切面类中理由@Order(1)注解，指定优先级



    //切入点表达式
    //1.execution：根据方法的签名来匹配
    //2.@annotation：根据注解来匹配

    //execution主要根据方法的返回值包名，类名，方法名，方法参数等信息来匹配
    //execution(访问修饰符? 返回值 包名.类名.?方法名(方法参数) throws 异常?)
    //其中带问号的地方可以省略

    //*：单个独立的任意符号，可以匹配任意返回值，包名，类名，方法名，方法参数
    //..:多个连续的任意符号，可以通配任意层级的包或者任意类型任意个数的参数


    //自定义注解的切入点
    @Before("@annotation(com.blue.aop.MyLog)")
    public void before(){
        log.info("before");
    }

    @MyLog
    public void add(){
        log.info("add");
    }


    //连接点
    //在spring中用JoinPoint抽象了连接点，用它可以获取连接点的信息，如方法名，方法参数，方法返回值，方法所在类等信息
    //对于@Around通知，获取连接点的信息，需要通过ProceedingJoinPoint参数获取
    //其它通知，获取连接点的信息，需要通过JoinPoint参数获取
    //都放在通知的参数中
    @Before("@annotation(com.blue.aop.MyLog)")
    public void hhh(JoinPoint joinPoint){
        //获取目标对象类名
        String className = joinPoint.getTarget().getClass().getName();
        //获取目标方法的方法名
        String methodName = joinPoint.getSignature().getName();
        //获取目标方法的参数
        Object[] args = joinPoint.getArgs();
        //放行
        
    }
}
