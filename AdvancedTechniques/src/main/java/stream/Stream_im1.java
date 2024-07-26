package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: stream
 * @Author: JuferBlue
 * @CreateTime: 2024-07-26  15:18
 * @Description: TODO
 * @Version: 1.0
 */
public class Stream_im1 {
    public static void main(String[] args) {
        //stream流的中间方法
        //filter: 过滤
        //limit: 截取前几个元素
        //skip: 跳过前几个元素
        //distinct: 去重
        //concat: 合并两个stream流
        //map:转换流中的数据类型


        //1.filter
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","张强","张三丰","张翠山","张良","王二麻子","谢广坤");
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张");
            }
        }).forEach(s-> System.out.println(s));
        list.stream().filter(s->s.startsWith("张")).forEach(s-> System.out.println(s));

        System.out.println("------------------------------");

        //2.limit 获取前几个
        list.stream().limit(3).forEach(s-> System.out.println(s));

        System.out.println("------------------------------");

        //3.skip 跳过前几个
        list.stream().skip(3).forEach(s-> System.out.println(s));

        System.out.println("------------------------------");

        //4.distinct 去重
        int[] arr = {1,2,1,2,4,3,2,1,4,5,6,6,7,8};
        Arrays.stream(arr).distinct().forEach(s-> System.out.println(s));

        System.out.println("------------------------------");

        //5.concat 合并两个stream流
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张无忌","张强","张三丰","张翠山");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"张良","王二麻子","谢广坤");
        Stream.concat(list1.stream(),list2.stream()).forEach(s-> System.out.println(s));

        System.out.println("------------------------------");

        //6.map 转换流中的数据类型
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3,"张无忌-15","张强-16","张三丰-17","张翠山-18");
        //只获取里面的年龄进行打印
//        list3.stream().map(new Function<String, Integer>() {
//            //第一个类型表示流中原本的数据类型
//            //第二个类型表示流中转换后的数据类型
//            @Override
//            public Integer apply(String s) {
//                return Integer.parseInt(s.split("-")[1]);
//            }
//        }).forEach(s-> System.out.println(s));

        list3.stream().map(s->Integer.parseInt(s.split("-")[1])).forEach(s-> System.out.println(s));
    }
}
