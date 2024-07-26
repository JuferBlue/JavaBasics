package method_reference;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: method_reference
 * @Author: JuferBlue
 * @CreateTime: 2024-07-26  16:35
 * @Description: TODO
 * @Version: 1.0
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String str) {
        String[] strs = str.split(",");
        this.name = strs[0];
        this.age = Integer.parseInt(strs[1]);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
