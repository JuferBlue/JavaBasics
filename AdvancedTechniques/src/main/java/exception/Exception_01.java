package exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: exception
 * @Author: JuferBlue
 * @CreateTime: 2024-07-26  16:56
 * @Description: TODO
 * @Version: 1.0
 */
public class Exception_01 {
    public static void main(String[] args) throws ParseException {
        //java.lang.Throwable:
            //Error：一般指java虚拟机无法处理的错误,一般程序员不管
            //Exception：一般指java程序可以处理的异常,一般程序员要处理
                //RuntimeException：编译不报错，运行时报错
                //其它异常：编译阶段出现异常提醒


        //编译时异常(编译阶段必须手动处理，否则代码报错)
        String time = "2030年1月1日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(time);
        System.out.println(date);

        //运行时异常(编译阶段是不需要处理的,是代码运行时出现的异常)
//        int[] arr = {1,2,3,4,5};
//        System.out.println(arr[10]);
    }
}
