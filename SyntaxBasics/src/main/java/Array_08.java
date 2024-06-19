/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: PACKAGE_NAME
 * @Author: JuferBlue
 * @CreateTime: 2024-06-19  16:15
 * @Description: TODO
 * @Version: 1.0
 */
public class Array_08 {
    public static void main(String[] args) {
        //数组定义

        //动态初始化
        int[] arr1 = new int[3];
        for(int i = 0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        System.out.println("=========");
        //静态初始化
        int[] arr2 = new int[]{1,2,3,4,5};
        for (int i = 0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
        System.out.println("=========");
        //简化动态初始化
        int[] arr3 = {1,2,3,4,5};
        for(int i =0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }
        //快速遍历快捷键: 数组名.fori捷键
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        System.out.println("=========");

        //数组扩容
        int[] oldArr = {1,2,3,4,5};
        int[] newArr = new int[10];

        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] =  oldArr[i];
        }
        //将新数组中的地址值给老数组
        oldArr = newArr;
        for (int i = 0; i < oldArr.length; i++) {
            System.out.println(oldArr[i]);
        }
        System.out.println("=========");


        //二维数组的定义

        //动态初始化
        int[][] arr4 = new int[3][4];



    }
}
