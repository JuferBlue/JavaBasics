package method_reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: method_reference
 * @Author: JuferBlue
 * @CreateTime: 2024-07-26  16:30
 * @Description: TODO
 * @Version: 1.0
 */
public class MethodReference3 {
    public static void main(String[] args) {
        //引用构造方法
        //格式：类名：：new
        //范例：Student::new

        //需求：集合里面存储年龄和姓名，要求封装Student对象并收集到List集合当中
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三,23","李四,24","王五,25");
        //封装
        List<Student> newList = list.stream().map(s->new Student(s.split(",")[0],Integer.parseInt(s.split(",")[1]))).collect(Collectors.toList());
        System.out.println(newList);

        //改写成方法引用
        List<Student> newList2 = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(newList2);


    }
}
