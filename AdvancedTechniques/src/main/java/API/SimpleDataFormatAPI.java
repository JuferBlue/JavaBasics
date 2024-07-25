package API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: API
 * @Author: JuferBlue
 * @CreateTime: 2024-07-25  23:57
 * @Description: TODO
 * @Version: 1.0
 */
public class SimpleDataFormatAPI {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        System.out.println(d1);

        //1.创建SimpleDateFormat对象
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //两种常用格式

        //2.日期对象转换为字符串
        String str1 = sdf1.format(d1);
        String str2 = sdf2.format(d1);
        System.out.println(str1);
        System.out.println(str2);

        //3.字符串转换为日期对象
        Date d2 = sdf1.parse(str1);
        Date d3 = sdf2.parse(str2);
        System.out.println(d2);
        System.out.println(d3);
    }
}
