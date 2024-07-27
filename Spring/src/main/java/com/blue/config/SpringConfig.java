package com.blue.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: com.blue.config
 * @Author: JuferBlue
 * @CreateTime: 2024-07-27  14:48
 * @Description: TODO
 * @Version: 1.0
 */
@Configuration //标注当前是一个配置类（代替配置文件）+@Component
@ComponentScan("com.blue") //包扫描
@PropertySource("classpath:jdbc.properties")//其它配置文件
public class SpringConfig {

}
