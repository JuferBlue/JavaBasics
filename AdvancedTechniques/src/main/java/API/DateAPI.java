package API;

import java.util.Date;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: API
 * @Author: JuferBlue
 * @CreateTime: 2024-07-03  23:51
 * @Description: TODO
 * @Version: 1.0
 */
public class DateAPI {
    public static void main(String[] args) {
        //1-创建对象表示时间
        Date d = new Date();
        System.out.println(d);

        //2-创建对象表示一个指定的时间
        Date d1 = new Date(0L);
        System.out.println(d1);

        //3-修改时间setTime(long time)
        d1.setTime(1000L);
        System.out.println(d1);
    }

}
