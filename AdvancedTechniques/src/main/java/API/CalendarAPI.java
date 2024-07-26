package API;

import java.util.Calendar;
import java.util.Date;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: API
 * @Author: JuferBlue
 * @CreateTime: 2024-07-26  00:12
 * @Description: TODO
 * @Version: 1.0
 */
public class CalendarAPI {
    public static void main(String[] args) {
        //Calendar代表了当前系统日历对象，可以单独修改获取时间中的年月日
        //是抽象类，不能直接实例化，需要使用子类对象
        //1.获取Calendar对象
        //会把当前系统时间的年月日等信息封装到一个数组中
        Calendar calendar = Calendar.getInstance(); //默认表示当前时间
        System.out.println(calendar);
        //2.获取日期对象
        Date d1 = calendar.getTime();
        System.out.println(d1);
        //3.给日历设置日期对象
        Date d2 = new Date();
        calendar.setTime(d2);
        //4.拿到当前时间毫秒值
        long time = calendar.getTimeInMillis();
        System.out.println(time);
        //5.给日历设置时间毫秒值
        calendar.setTimeInMillis(10000L);
        //6.获取日历中的年,月日等
        //月份0-11月
        //星期天是第一天
        int year = calendar.get(Calendar.YEAR);
        //也可以根据索引获取
        //0：纪元
        //1：年
        //2：月
        //3：一年的第几周
        //4：一个月的第几周
        //5.一个月的第几天
        int week = calendar.get(3);
        System.out.println(year);
        System.out.println(week);
        //7.修改日历中的年,月日等
        calendar.set(Calendar.YEAR,2025);
        //8.增加或减少时间
        calendar.add(Calendar.YEAR,-1); //减少一年
    }
}
