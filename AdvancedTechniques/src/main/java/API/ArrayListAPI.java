package API;

import java.util.ArrayList;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: API
 * @Author: JuferBlue
 * @CreateTime: 2024-07-03  23:42
 * @Description: TODO
 * @Version: 1.0
 */
public class ArrayListAPI {
    public static void main(String[] args) {
        //集合创建
        ArrayList<String> list = new ArrayList<>();
        //增
        list.add("a");
        list.add("b");
        list.add("c");
        //删
        list.remove(0);
        list.remove("b");
        //改
        list.set(0,"d");
        //查
        System.out.println(list.get(0));
        //长度
        System.out.println(list.size());

        //遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
