package reflection;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: reflection
 * @Author: JuferBlue
 * @CreateTime: 2024-07-26  19:48
 * @Description: TODO
 * @Version: 1.0
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }
    public Student(String name) {
        this.name = name;
    }
    protected Student(int age) {
        this.age = age;
    }
    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void show(){
        System.out.println("我是一个方法");
    }
    private void showAge(int age){
        System.out.println("年龄是："+age);
    }
}
