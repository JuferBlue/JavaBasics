package reflection;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: reflection
 * @Author: JuferBlue
 * @CreateTime: 2024-07-26  20:20
 * @Description: TODO
 * @Version: 1.0
 */
public class Reflection_03 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        //获取成员变量
        Class clazz = Class.forName("reflection.Student");

        //1.getField:获取public修饰的成员变量
        Field[] fields1 = clazz.getFields();
        Arrays.stream(fields1).forEach(System.out::println);
        System.out.println("----------------------");
        //2.getDeclaredFields:获取所有成员变量
        Field[] fields2 = clazz.getDeclaredFields();
        Arrays.stream(fields2).forEach(System.out::println);
        System.out.println("----------------------");
        //3.getField:获取public修饰的成员变量
//        Field field1 = clazz.getField("name");
//        System.out.println(field1);
//        System.out.println("----------------------");
        //4.getDeclaredField:获取所有成员变量
        Field field1 = clazz.getDeclaredField("age");
        Field field2 = clazz.getDeclaredField("name");
        System.out.println(field1);
        System.out.println(field2);
        System.out.println("----------------------");

        //获取权限修饰符
        int modifiers1 = field1.getModifiers();
        int modifiers2 = field2.getModifiers();
        System.out.println(modifiers1);
        System.out.println(modifiers2);
        System.out.println("----------------------");

        //获取变量类型
        Class type1 = field1.getType();
        Class type2 = field2.getType();
        System.out.println(type1);
        System.out.println(type2);
        System.out.println("----------------------");
        //获取成员变量记录的值
        Student student = new Student();
        student.setAge(12);
        student.setName("JuferBlue");
        field2.setAccessible(true);
        String name = (String) field2.get(student);
        System.out.println(name);
        System.out.println("----------------------");
        //修改成员变量的值
        field2.set(student,"chengyingying");
        System.out.println(student);
    }
}
