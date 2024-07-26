package stream;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: stream
 * @Author: JuferBlue
 * @CreateTime: 2024-07-26  14:57
 * @Description: TODO
 * @Version: 1.0
 */
public class Stream_2 {
    public static void main(String[] args) {
        //得到stream流
        // 单列集合 .stream()
        // 数组 Arrays中的方法
        // 零星数据 Stream接口中的静态方法
        // stream类中的方法分为中间方法和终结方法

        //1.单列集合获取stream流
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三","李四","王五","赵六","田七");
//        Stream<String> stream1 =list.stream();
//        //使用终结方法打印流水线上所有数据
//        stream1.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        list.stream().forEach(s -> System.out.println(s));


    }
}
