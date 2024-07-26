package exception;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: exception
 * @Author: JuferBlue
 * @CreateTime: 2024-07-26  17:31
 * @Description: TODO
 * @Version: 1.0
 */
public class Exception_04 {
    public static void main(String[] args) {
        //throws:写在方法定义处，表示声明一个异常，告诉调用者使用本方法可能会有哪些异常
        //编译时异常：必须要写
        //运行时异常：可以不写

        //throw：写在方法里面，结束方法，用来手动抛出异常对象，交给调用者，方法中下面的代码不再执行


        //需求：定义一个方法求数组的最大值

        //数组为null或者长度为0，抛出异常
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = 0;
//        int max = getMax(arr);
//        System.out.println(max);
        try {
            max = getMax(arr);
        }catch (NullPointerException e){
            System.out.println("数组为null抛出异常");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组长度为0抛出异常");
        }

        System.out.println(max);

    }

    public static int getMax(int[] arr) {
        if(arr==null){
            //手动创建一个异常的对象，并把这个异常交给方法的调用者处理
            //此时方法就会结束，下面的代码就不会再执行了
            throw new NullPointerException();
        }
        if(arr.length==0){
            throw new ArrayIndexOutOfBoundsException();
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
