import java.util.Random;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: PACKAGE_NAME
 * @Author: JuferBlue
 * @CreateTime: 2024-06-19  15:58
 * @Description: TODO
 * @Version: 1.0
 */
public class Random_06 {
    public static void main(String[] args) {
        Random rd = new Random();
        int num = rd.nextInt(100);
        System.out.println(num);
        //生成1到100的随机数
        int num2 = rd.nextInt(100)+1;
        System.out.println(num2);
        //生成100-999的随机数
        int num3 = rd.nextInt(900)+100;
        System.out.println(num3);
    }

}
