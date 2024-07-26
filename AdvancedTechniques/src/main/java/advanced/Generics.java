package advanced;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: advanced
 * @Author: JuferBlue
 * @CreateTime: 2024-07-26  11:32
 * @Description: TODO
 * @Version: 1.0
 */
public class Generics {
    public static void main(String[] args) {
        //泛型只支持引用数据类型
        //1.类上面定义泛型
        //
//        class Generic<T>{
//            private T key;
//            public Generic(T key){
//                this.key = key;
//            }
//            public T getKey(){
//                return key;
//            }
//        }



    }
    //2.方法上面的泛型
    //第一个T表示这个一个泛型方法
    //第二个T表示参数泛型

    public <T> void test(T t){
        System.out.println(t);
    }
    //3.接口泛型

}
