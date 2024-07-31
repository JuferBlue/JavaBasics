package com.blue.springboot;

import com.blue.Application;
import com.blue.controller.EmpController;
import org.dom4j.io.SAXReader;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.xml.parsers.SAXParser;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: com.blue.springboot
 * @Author: JuferBlue
 * @CreateTime: 2024-07-30  14:23
 * @Description: TODO
 * @Version: 1.0
 */
@SpringBootTest
public class BeanManager {
    @Autowired
    private ApplicationContext applicationContext;//获取ioc容器对象
    //bean的获取
    @Test
    public void testGetBean(){
        //根据bean的名称获取
        EmpController empController = (EmpController)applicationContext.getBean("empController");//将类名首字母小写作为参数传入
        System.out.println(empController);

        //根据bean的类型获取
        EmpController bean = applicationContext.getBean(EmpController.class);
        System.out.println(bean);
        //根据bean的名称及类型获取
        EmpController bean1 = applicationContext.getBean("empController", EmpController.class);
        System.out.println(bean1);
    }

    //bean的作用域
    @Test
    public void testScope(){

    }

    //第三方bean的管理
    //在Application中声明第三方bean,不推荐
    //可以通过@Configuration注解声明一个配置类对这些第三方bean进行管理
    @Autowired
    private SAXReader saxReader;

    @Test
    public void testBean(){
        SAXReader saxReader = (SAXReader) applicationContext.getBean(SAXReader.class);
        System.out.println(saxReader);
    }



}
