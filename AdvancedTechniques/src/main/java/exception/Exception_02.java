package exception;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: exception
 * @Author: JuferBlue
 * @CreateTime: 2024-07-26  17:08
 * @Description: TODO
 * @Version: 1.0
 */
public class Exception_02 {
    public static void main(String[] args) {
        // 异常作用一：异常是用来查询bug的关键参考信息
        // 异常作用二：异常可以作为方法内部的一种特殊返回值，以便通知调用者底层的执行情况

        //1.JVM默认处理异常方式：1.打印错误信息 2.退出程序

        //2.自己处理异常(捕获异常)
        int[] arr = {1,2,3,4,5};
        try {
            //可能出现异常的代码
            System.out.println(arr[7]);
        }catch (ArrayIndexOutOfBoundsException e){//异常类名 变量名
            //异常处理代码
            System.out.println("数组越界了");
        }
        //正确捕获异常可以继续执行
        System.out.println("程序继续执行");

        //2.1如果try中遇到了多个问题如何执行
        try {
            System.out.println(arr[7]);
            System.out.println(2/0);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界了");
        }catch (ArithmeticException e){
            System.out.println("除数不能为0");
        }
        //2.2如果捕获多个异常，存在父子关系，则父类一定要写在子类下面
        try {
            System.out.println(arr[7]);
            System.out.println(2/0);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界了");
        }catch (ArithmeticException e){
            System.out.println("除数不能为0");
        }catch (Exception e){
            System.out.println("其他异常");
        }
        //2.3JDK7以后，多个异常可以合并捕获
        try {
            System.out.println(arr[7]);
            System.out.println(2/0);
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("异常");
        }
        //2.4异常没有被捕获 直接报错

        //

    }
}
