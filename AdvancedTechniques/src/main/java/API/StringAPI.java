package API;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: API
 * @Author: JuferBlue
 * @CreateTime: 2024-07-03  23:03
 * @Description: TODO
 * @Version: 1.0
 */
public class StringAPI {
    public static void main(String[] args) {
        //1-字符串拼接
        String str1 = "hello";
        String str2 = "world";
        System.out.println(str1+str2);//相加是第三个字符串

        //2-字符串创建的方式
        String str3 = "hello";
        String str4 = new String("world");
        System.out.println(str3+str4);
        //传入字符数组和字节数组
        char[] charArray = {'a','b','c'};
        byte[] byteArray = {97,98,99};
        String str5 = new String(charArray);
        String str6 = new String(byteArray);
        System.out.println(str5+str6);


        //3-字符串比较
        String str7 = "hello";
        String str8 = "Hello";
        //equals：比较字符串的内容是否相等
        //equalsIgnoreCase：比较字符串的内容是否相等，忽略大小写
        System.out.println(str7.equals(str8));
        System.out.println(str7.equalsIgnoreCase(str8));

        //4-字符串的拼接
        StringBuilder sb = new StringBuilder();
        //append:拼接字符串,返回值是StringBuilder对象
        sb.append("hello");
        //reverse:反转字符串
        sb.reverse();
        //length:获取字符串的长度
        System.out.println(sb.length());
        System.out.println(sb);
        //toString:将StringBuilder对象转换为字符串
        String str9 = sb.toString();
        System.out.println(str9);
    }
}
