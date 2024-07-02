/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: PACKAGE_NAME
 * @Author: JuferBlue
 * @CreateTime: 2024-07-02  17:42
 * @Description: TODO
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Student();
        p.study();
    }
}


class Person{
    public void sleep(){
        System.out.println("正常人每天睡觉8小时");
    }
}

class Student extends Person{

    @Override
    public void sleep(){
        System.out.println("学生每天睡觉6小时");
    }

    public void study(){
        System.out.println("学生学习");
    }
}