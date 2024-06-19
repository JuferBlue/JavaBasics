/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: PACKAGE_NAME
 * @Author: JuferBlue
 * @CreateTime: 2024-06-19  15:15
 * @Description: TODO
 * @Version: 1.0
 */
public class DataTypeConversion_03 {
    public static void main(String[] args) {
        //1.自动类型转换
        //将取值范围小的数据类型赋值给取值范围大的数据类型 -> 小自动转大
        //取值范围小的数据类型和取值范围大的数据类型做运算 -> 小自动转大
        int a = 10;
        double b = 2.4;
        System.out.println(a+b);
        System.out.println("==============================");

        //2.强制类型转换
        //将取值范围大的数据类型赋值给取值范围小的数据类型
        //取值范围小的数据类型 变量名 = 取值范围大的数据类型 -> 需要强转
        //取值范围小的数据类型 变量名 = (取值范围小的数据类型)取值范围大的数据类型

        //溢出
        int j = (int) 10000000000L;
        System.out.println(j);
    }
}
