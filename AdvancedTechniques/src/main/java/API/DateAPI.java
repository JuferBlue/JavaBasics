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

        //4-获取时间getTime()
        Long time = d1.getTime();
        System.out.println(time); //单位毫秒

        //5-设置时间
        Date date = new Date();
        date.setYear(117); // 将年份设置为 2017 年
        date.setMonth(5);  // 将月份设置为 6 月
        date.setDate(1);   // 将日期设置为 1 日
        // 注意：月份是从 0 开始的，所以 5 表示 6 月。
        System.out.println(date);
        //6-获取详细时间
        int year = date.getYear();  // 获取年份
        int month = date.getMonth(); // 获取月份
        int day = date.getDate();    // 获取日期
        int hours = date.getHours(); // 获取小时

        //7-比较时间
        Date date1 = new Date(1000L);
        Date date2 = new Date(2000L);
        boolean isBefore = date1.before(date2);
        boolean isAfter = date1.after(date2);
        boolean isEqual = date1.equals(date2);
        System.out.println(isBefore);
        System.out.println(isAfter);
        System.out.println(isEqual);
    }

}
