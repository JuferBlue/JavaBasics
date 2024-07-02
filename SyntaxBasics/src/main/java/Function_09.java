/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: PACKAGE_NAME
 * @Author: JuferBlue
 * @CreateTime: 2024-06-19  16:28
 * @Description: TODO
 * @Version: 1.0
 */
public class Function_09 {
    public static void main(String[] args) {
        //无参数方法的定义和调用
        my_print();
        //带参数方法的定义和调用
        System.out.println(getMax(10,20));
        //可变形参的方法调用
        System.out.println(add2(1,2,3,4,5));
    }

    /**
     * @description: 1-无参数方法的定义和调用
     * @author: JuferBlue
     * @date: 2024/7/1 22:35
     * @param:
     * @return: void
     **/
    public static void my_print(){
        System.out.println("hello function");;
    }

    /**
     * @description:2-带参数的方法
     * @author: JuferBlue
     * @date: 2024/7/1 22:36
     * @param: a
     * @param: b
     * @return: int
     **/
    public static int getMax(int a,int b){
        return a>b?a:b;
    }

    //3-方法重载:
    //多个方法在同一个类中
    //多个方法具有相同的方法名
    //多个方法的参数不相同，类型不同或者数量不同
    public static int add(int a,int b){
        System.out.println("我是int的add方法");
        return a+b;
    }
    public static double add(double a,double b){
        System.out.println("我是double的add方法");
        return a+b;
    }

    //4-可变形参的方法
    //在调用方法时类型确定，但是数量不确定
    public static int add2(int...num){
        //相当于传入的是一个int[] num
        int sum = 0;
        for(int i:num){
            sum+=i;
        }
        System.out.println("我是可变形参的方法");
        return sum;
    }



}
