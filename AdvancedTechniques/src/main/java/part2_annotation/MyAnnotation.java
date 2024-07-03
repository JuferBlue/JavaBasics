package part2_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//元注解：1.@Retention 2.@Target 3.@Documented 4.@Inherited
//作用：用于修饰其它注解的注解

//@Target 指定注解针对的地方
//ElementType.TYPE：类、接口、枚举
//ElementType.FIELD：字段
//ElementType.METHOD：方法
//ElementType.CONSTRUCTOR：构造方法
//ElementType.PARAMETER：参数
//ElementType.LOCAL_VARIABLE：局部变量
//ElementType.ANNOTATION_TYPE：注解类型声明
//ElementType.PACKAGE：包


//@Retention 指定注解的保留范围
//RetentionPolicy.SOURCE：注解仅保留在源文件中，编译器将丢弃这种类型的注解
//RetentionPolicy.CLASS：注解保留在class文件中，但jvm将丢弃这种类型的注解
//RetentionPolicy.RUNTIME：注解保留在class文件中，jvm将保留这种类型的注解

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

}


