package method_reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: advanced
 * @Author: JuferBlue
 * @CreateTime: 2024-07-26  14:41
 * @Description: TODO
 * @Version: 1.0
 */
public class MethodReference1 {
    public static void main(String[] args) {
        //引用静态方法  或者成员方法都一样
        //类目：静态方法
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5");
        //把集合中的数字变成int型
//        list.stream().map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return Integer.parseInt(s);
//            }
//        }).forEach(System.out::println);
        list.stream().map(Integer::parseInt).forEach(System.out::println);

    }
}
