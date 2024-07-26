package exception;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: exception
 * @Author: JuferBlue
 * @CreateTime: 2024-07-26  17:26
 * @Description: TODO
 * @Version: 1.0
 */
public class Exception_03 {
    public static void main(String[] args) {
        //异常中的常见方法
        //Throwable的成员方法
        //1.getMessage()：获取异常的描述信息
        //2.toString()：获取异常的详细信息
        //3.printStackTrace()：打印异常的跟踪栈信息
        int[] arr = {1,2,3};
        try {
            System.out.println(arr[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}
