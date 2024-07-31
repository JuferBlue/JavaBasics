package com.blue.config;

import com.blue.controller.EmpController;
import org.dom4j.io.SAXReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.xml.sax.*;

import javax.xml.parsers.SAXParser;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: com.blue.config
 * @Author: JuferBlue
 * @CreateTime: 2024-07-30  14:52
 * @Description: TODO
 * @Version: 1.0
 */
@Configuration
public class CommonConfig {

    @Bean //将当前方法的返回值对象交给IOC容器管理，成为IOC容器bean
    public SAXReader saxReader(EmpController empController){
        System.out.println(empController);
        //第三方bean中要注入其它bean直接写在形参中
        return new SAXReader();

    }
}
