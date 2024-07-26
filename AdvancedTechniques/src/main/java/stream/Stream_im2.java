package stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: stream
 * @Author: JuferBlue
 * @CreateTime: 2024-07-26  15:38
 * @Description: TODO
 * @Version: 1.0
 */
public class Stream_im2 {
    public static void main(String[] args) {
        //stream流的终结方法
        //forEach:遍历
        //count:统计
        //toArray:将流中的元素转换为数组
        //collect:将流中的元素收集到一个集合中

        //1.foreach
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","张强","张三丰","张翠山","张良","王二麻子","谢广坤");
//        list.stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        list.stream().forEach(s -> System.out.println(s));

        System.out.println("---------------------------");

        //2.count
        long count = list.stream().count();
        System.out.println(count);

        System.out.println("---------------------------");

        //3.toArray
        //空参
        Object[] objects = list.stream().toArray();
        System.out.println(Arrays.toString(objects));
        //有参
        //IntFunction泛型：具体类型的数组
        //apply形参：流中数据个数要与数组长度保持一致
        //返回值：返回一个数组
        String[] arr = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr));
        String[] arr2 = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(arr2));

        System.out.println("---------------------------");

        //4.collect
        ArrayList<String> list4 = new ArrayList<>();
        Collections.addAll(list4,"张无忌-男-24","张强-男-25","张三丰-男-100","张翠山-男-40","张良-男-20","王二麻子-男-18","谢广坤-男-18");

        //收集到List集合当中
        //需求：
        //我们要把所有的男性收集起来
        List<String> manList = list4.stream().filter(s -> s.split("-")[1].equals("男")).collect(Collectors.toList());

        //收集到Set集合当中
        Set<String> manList2 = list4.stream().filter(s -> s.split("-")[1].equals("男")).collect(Collectors.toSet());
        System.out.println(manList2);

        //收集到Map集合当中
        //要求男性
        //键：姓名
        //值：年龄

        Map map = list4.stream()
                .filter(s -> s.split("-")[1].equals("男"))
                //泛型第一形参表示流的数据类型，第二个形参表示键
                .collect(Collectors.toMap(new Function<String, String>() {
                    //表示键的生成规则
                    @Override
                    public String apply(String s) {
                        return s.split("-")[0];
                    }
                    ////泛型第一形参表示流的数据类型，第二个形参表示值
                }, new Function<String, Integer>() {
                    //表示值的生成规则
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }));
        System.out.println(map);
    }
}
