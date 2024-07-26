package API;

import java.util.Arrays;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: API
 * @Author: JuferBlue
 * @CreateTime: 2024-07-26  11:13
 * @Description: TODO
 * @Version: 1.0
 */
public class ArraysAPI {
    public static void main(String[] args) {
        //用于操作数组的类
        int[] arr = {3,4,1,5,2};
        //1.把数组拼接成字符串
        String str = Arrays.toString(arr);
        System.out.println(str);//[3, 4, 1, 5, 2]
        //2.二分查找
        int index = Arrays.binarySearch(arr, 5);
        System.out.println(index);
        //3.排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5]
        //4.填充
        Arrays.fill(arr, 1);
        System.out.println(Arrays.toString(arr));//[1, 1, 1, 1, 1]
        //5.复制
        int[] arr1 = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(arr1));//[1, 1, 1, 1, 1, 0, 0, 0, 0, 0]

    }
}
