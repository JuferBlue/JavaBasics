package method_reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: method_reference
 * @Author: JuferBlue
 * @CreateTime: 2024-07-26  16:46
 * @Description: TODO
 * @Version: 1.0
 */
public class MethodReference4 {
    public static void main(String[] args) {
        //引用数组的构造方法
        //格式：数据类型[]::new
        //范例：int::new


        //需求:集合中存储一些整数，收集到数组当中
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
        //收集到数组中
        Integer[] arr = list.stream().toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
        });

        Integer[] arr1 = list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr1));
    }
}
