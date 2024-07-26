package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.util.Arrays;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: reflection
 * @Author: JuferBlue
 * @CreateTime: 2024-07-26  19:58
 * @Description: TODO
 * @Version: 1.0
 */
public class Reflection_02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //反射获取构造方法
        Class clazz = Class.forName("reflection.Student");
        //1.getConstructor: 获取公有构造方法public
        Constructor[] cons1 = clazz.getConstructors();
        Arrays.stream(cons1).forEach(System.out::println);

        System.out.println("--------------------");

        //2.getDeclaredConstructor: 获取所有构造方法
        Constructor[] cons2 = clazz.getDeclaredConstructors();
        Arrays.stream(cons2).forEach(System.out::println);

        System.out.println("--------------------");

        //3.getConstructor(): 获取单个公有构造方法对象
        Constructor con1 = clazz.getConstructor(); //空参构造的公有构造方法
        System.out.println(con1);
        Constructor con2 = clazz.getConstructor(String.class); //带参构造的公有构造方法
        System.out.println(con2);


        //4.getDeclaredConstructor(): 获取单个构造方法对象
        Constructor con3 = clazz.getDeclaredConstructor(int.class);
        System.out.println(con3);
        Constructor con4 = clazz.getDeclaredConstructor(String.class,int.class);//顺序很重要
        System.out.println(con4);

        System.out.println("--------------------");

        //获取构造方法的权限修饰符
        int modifier1 = con1.getModifiers();
        int modifier2 = con2.getModifiers();
        int modifier3 = con3.getModifiers();
        int modifier4 = con4.getModifiers();
        System.out.println(modifier1);
        System.out.println(modifier2);
        System.out.println(modifier3);
        System.out.println(modifier4);
        System.out.println("--------------------");
        //获取构造方法的所有参数
        Parameter[] parameters4 = con4.getParameters();
        Arrays.stream(parameters4).forEach(System.out::println);
        System.out.println("--------------------");
        //获取构造方法的参数类型
        Class[] parameterTypes4 = con4.getParameterTypes();
        System.out.println(Arrays.toString(parameterTypes4));
        System.out.println("--------------------");
        //创建对象   私有的构造方法不能直接创造对象
        con4.setAccessible(true); //临时取消权限校验
        Student student = (Student) con4.newInstance("JuferBlue",18);
        System.out.println(student);
    }
}
