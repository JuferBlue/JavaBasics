package stream;

import java.util.HashMap;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: stream
 * @Author: JuferBlue
 * @CreateTime: 2024-07-26  15:09
 * @Description: TODO
 * @Version: 1.0
 */
public class Stream_3 {
    public static void main(String[] args) {
        //双列集合
        HashMap<String,Integer> map = new HashMap<>();
        map.put("张三",23);
        map.put("李四",24);
        map.put("王五",25);
        map.put("赵六",26);

        //第一种获取stream流
        map.keySet().stream().forEach(s-> System.out.println(s));
        //第二种获取stream流
        map.entrySet().stream().forEach(s-> System.out.println(s));
    }
}
