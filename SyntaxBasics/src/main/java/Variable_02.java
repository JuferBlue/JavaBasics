/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: PACKAGE_NAME
 * @Author: JuferBlue
 * @CreateTime: 2024-06-19  15:01
 * @Description: TODO
 * @Version: 1.0
 */
public class Variable_02 {
    public static void main(String[] args) {
        //整型:byte short int long
        //浮点型:float double
        //字符型:char
        //布尔型:boolean

        //string 是引用数据类型但定义和基本类型一样

        //byte:1字节,8位,范围[-128,127]
        byte bt = 100;
        System.out.println(bt);

        //short:2字节,16位,范围[-32768,32767]
        short st = 100;
        System.out.println(st);

        //int:4字节,32位,范围[-2147483648,2147483647]
        int it = 100;
        System.out.println(it);

        //long:8字节,64位,范围[]
        long lt = 100;
        System.out.println(lt);

        //float:4字节,单精度浮点数,范围[-3.4028235E38,3.4028235E38]
        float ft = 100f;
        System.out.println(ft);

        //double:8字节,双精度浮点数,范围[-1.7976931348623157E308,1.7976931348623157E308]
        double dt = 100;
        System.out.println(dt);

        //char:2字节,字符型,范围[0,65535]
        char ct = 'A';
        System.out.println(ct);

        //boolean:1字节,布尔型,范围[true,false]
        boolean b = true;
        System.out.println(b);

        System.out.println("=======================================================");

        //浮点型除法
        int num1 = 10;
        double num2 = 2;
        System.out.println("num1/num2="+num1/num2);

        //精度问题
        float num3 = 0.12f;
        float num4 = 0.23f;
        float num5 = num4-num3;
        System.out.println("num3+num4="+num5);

        //转义字符\
        //\n:换行
        System.out.println("hello\nworld");

        //用String表示一个路径的时候，用两个\\代表一个\
        System.out.println("D:\\JavaBasics\\src\\main\\java");



    }
}
