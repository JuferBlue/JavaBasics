import java.util.Scanner;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: PACKAGE_NAME
 * @Author: JuferBlue
 * @CreateTime: 2024-06-19  15:38
 * @Description: TODO
 * @Version: 1.0
 */
public class KeyboardInput_05 {
    public static void main(String[] args) {
        //next():录入字符串 -> 遇到空格和回车就结束录入了
        //nextLine():录入字符串 -> 遇到回车就结束录入了
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串:");
        String str1 = sc.next();
        System.out.println(str1);
        System.out.print("请输入一个字符串:");
        String str2 = sc.nextLine();
        System.out.println(str2);
    }
}
