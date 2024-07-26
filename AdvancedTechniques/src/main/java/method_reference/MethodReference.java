package method_reference;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: advanced
 * @Author: JuferBlue
 * @CreateTime: 2024-07-26  14:28
 * @Description: TODO
 * @Version: 1.0
 */
public class MethodReference {
    public static void main(String[] args) {
        //需求创建一个数组,进行倒序排序
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        //匿名内部类
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        //Lambda表达式
        Arrays.sort(arr,(o1,o2)->o2-o1);
        //方法引用
        //1.引用处应该是函数式接口
        //2.被引用的方法需要已经存在
        //3.被引用方法的形参和返回值类型与引用处一致
        //4.被引用方法的功能需要满足当前需求
        //类名：：方法名
        Arrays.sort(arr,MethodReference::subtraction);
        for (Integer integer : arr) {
            System.out.println(integer);
        }

    }
    public static int subtraction(int a,int b){
        return b-a;
    }
}
