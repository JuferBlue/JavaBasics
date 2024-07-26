package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.Objects;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: reflection
 * @Author: JuferBlue
 * @CreateTime: 2024-07-26  20:36
 * @Description: TODO
 * @Version: 1.0
 */
public class Reflection_04 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //  获取成员方法
        Class clazz = Class.forName("reflection.Student");

        //1. 获取所有公有方法包括继承的，返回数组
        Method[] methods = clazz.getMethods();
        Arrays.stream(methods).forEach(System.out::println);
        System.out.println("-------------------------------------");
        //2. 获取所有方法，包括私有的，不包括继承的  返回数组
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Arrays.stream(declaredMethods).forEach(System.out::println);
        System.out.println("-------------------------------------");

        //3.返回单个公有方法
        Method method1 = clazz.getMethod("show");
        System.out.println(method1);
        System.out.println("-------------------------------------");
        //4.返回单个方法
        Method method2 = clazz.getDeclaredMethod("showAge", int.class);
        System.out.println(method2);
        System.out.println("-------------------------------------");


        //获取方法的修饰符
        int modifiers = method2.getModifiers();
        System.out.println(modifiers);
        System.out.println("-------------------------------------");

        //获取方法的名字
        String name = method2.getName();
        System.out.println(name);
        System.out.println("-------------------------------------");

        //获取方法的形参
        Parameter[] parameters = method2.getParameters();
        Arrays.stream(parameters).forEach(System.out::println);
        System.out.println("-------------------------------------");

        //获取方法的异常
        Class[] exceptionTypes = method2.getExceptionTypes();
        Arrays.stream(exceptionTypes).forEach(System.out::println);
        System.out.println("-------------------------------------");

        //方法的运行
        //第一个参数:用obj对象调用该方法
        //第二个参数:调用该方法时传递的实际参数
        //Object invoke(Object obj, Object... args)
        Student student = new Student();
        student.setAge(18);
        student.setName("JuferBlue");
        method2.setAccessible(true);
        method2.invoke(student, 18);

    }
}
