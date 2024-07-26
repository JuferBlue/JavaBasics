package API;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Set;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: API
 * @Author: JuferBlue
 * @CreateTime: 2024-07-26  07:32
 * @Description: TODO
 * @Version: 1.0
 */
public class JDK8DateAPI {
    public static void main(String[] args) {
        //ZoneId:时区API
        //1.获取所有的时区
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        //zoneIds.forEach(System.out::println);
        //2.获取系统默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
        //3.获取指定时区的时区
        ZoneId zoneId1 = ZoneId.of("Asia/Shanghai");


        //Instant:时间戳API
        //1.获取当前时间戳:世界时间并非中国时间
        Instant time = Instant.now();
        System.out.println(time);//2024-07-26T02:30:33.675371700Z
        //2.根据时间戳获取时间
        Instant time1 = Instant.ofEpochMilli(1000L);//秒/毫秒/纳秒
        Instant time2 = Instant.ofEpochSecond(1000L);
        System.out.println(time1);
        System.out.println(time2);
        //3.指定时区
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);
        //4.isxxx判断时间前后关系
        Instant time3 = Instant.ofEpochMilli(1000L);
        Instant time4 = Instant.ofEpochMilli(2000L);
        System.out.println(time3.isBefore(time4));
        System.out.println(time3.isAfter(time4));
        System.out.println(time3.equals(time4));
        //5.minusxxx减少时间 会产生一个新的对象，因为Instant对象是无法被修改的
        Instant time5 = Instant.ofEpochMilli(3000L);
        System.out.println(time5); //1970-01-01T00:00:03Z
        Instant time6 = time5.minusSeconds(1);
        System.out.println(time6); //1970-01-01T00:00:02Z


        //ZonedDateTime:带时区的时间API
        //1.获取当前时间对象带时区
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
        System.out.println(zonedDateTime1);//2024-07-26T10:28:21.045867300+08:00[Asia/Shanghai]
        //2.获取指定时区的时间对象
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(2024,7,26,10,28,21,0,ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime2);//2024-07-26T10:28:21+08:00[Asia/Shanghai]
        //3.通过Instant+时区方式获取时间悐
        Instant instant =  Instant.ofEpochMilli(0L);
        ZoneId zoneId2 = ZoneId.of("Asia/Shanghai");
        ZonedDateTime zonedDateTime3 = ZonedDateTime.ofInstant(instant,zoneId2);
        System.out.println(zonedDateTime3);//1970-01-01T08:00+08:00[Asia/Shanghai]
        //4.withxxx修改时间系列的方法
        ZonedDateTime zonedDateTime4 = zonedDateTime3.withYear(2025);
        System.out.println(zonedDateTime4);//2025-01-01T08:00+08:00[Asia/Shanghai]
        //5.减少时间
        ZonedDateTime zonedDateTime5 = zonedDateTime4.minusDays(1);
        System.out.println(zonedDateTime5);//2024-12-31T08:00+08:00[Asia/Shanghai]
        //6.增加时间
        ZonedDateTime zonedDateTime6 = zonedDateTime5.plusDays(1);
        System.out.println(zonedDateTime6);//2025-01-01T08:00+08:00[Asia/Shanghai]


        //DateTimeFormatter:时间格式化API
        ZonedDateTime zonedDateTime7 = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = dateTimeFormatter.format(zonedDateTime7);
        System.out.println(format); //2024-07-26 10:38:39

        //LocalDate:年月日
        //1.获取时间对象
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);//2024-07-26
        //2.获取指定时间对象
        LocalDate localDate1 = LocalDate.of(2024,4,23);
        System.out.println(localDate1);//2024-04-23
        //3.getxxx:获取时间系列的方法
        int year = localDate1.getYear();
        int month = localDate1.getMonthValue();
        int day = localDate1.getDayOfMonth();
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        //4.isxxx判断时间前后关系
        //5withxxx修改时间系列的方法
        //6.minusxxx减少时间
        //7.plusxxx增加时间

        //LocalTime:时分秒

        //LocalDateTime:年月日时分秒
        LocalDateTime localDateTime = LocalDateTime.now();
        //1.转为LocalDate和LocalTime
        LocalDate localDate2 = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();

        System.out.println("------------------------");

        //Duration:时间差API:秒，纳秒
        LocalDateTime today1 = LocalDateTime.now();
        System.out.println(today1);
        LocalDateTime birthday1 = LocalDateTime.of(2003,8,2,0,0,0);
        Duration duration = Duration.between(birthday1,today1);
        System.out.println(duration);//PT183946H58M50.9263095S
        System.out.println(duration.toDays());//相差天数
        System.out.println(duration.toHours());//相差小时
        System.out.println(duration.toMinutes());//相差分钟
        System.out.println(duration.toSeconds());//相差秒
        System.out.println(duration.toMillis());//相差毫秒
        System.out.println(duration.toNanos());//相差纳秒

        System.out.println("--------------------------------");

        //Period:日期差API:年，月，日
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate birthday = LocalDate.of(2003,8,2);
        Period period = Period.between(birthday,today);//第二个参数减第一个参数
        System.out.println(period);//P20Y11M24D
        System.out.println(period.getYears());//20
        System.out.println(period.getMonths());//11
        System.out.println(period.getDays());//24

        System.out.println("---------------------------------");

        //ChronoUnit:用于计算两个日期间隔时间
        LocalDateTime today2 = LocalDateTime.now();
        LocalDateTime birthday2 = LocalDateTime.of(2003,8,2,0,0,0);
        long days = ChronoUnit.DAYS.between(birthday2,today2);
        System.out.println(days);
        long hours = ChronoUnit.HOURS.between(birthday2,today2);
        System.out.println(hours);


    }
}
