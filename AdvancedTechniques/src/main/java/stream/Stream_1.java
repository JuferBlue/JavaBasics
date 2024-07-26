package stream;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: stream
 * @Author: JuferBlue
 * @CreateTime: 2024-07-26  14:54
 * @Description: TODO
 * @Version: 1.0
 */
public class Stream_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","张强","张三丰","张翠山","张良","王二麻子","谢广坤");
        //过滤出以张开头并且长度为3的元素
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(name -> System.out.println(name));
    }
}
