package reflection;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: reflection
 * @Author: JuferBlue
 * @CreateTime: 2024-07-26  19:46
 * @Description: TODO
 * @Version: 1.0
 */
public class Reflection_01 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 获取Class对象的3种方式
        //1. Class.forName("全类名")包名+类名    最常用的
        Class clazz1 = Class.forName("reflection.Student");
        System.out.println(clazz1);

        //2. 类名.class  多用于传参
        Class clazz2 = Student.class;
        System.out.println(clazz2);
        System.out.println(clazz1 == clazz2);


        //3. 对象.getClass()   当我们已经有了这个类的对象时才可以使用
        Student s = new Student();
        Class clazz3 = s.getClass();
        System.out.println(clazz3);
        System.out.println(clazz1 == clazz3);
    }
}
