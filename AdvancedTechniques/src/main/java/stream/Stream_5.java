package stream;

import java.util.stream.Stream;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: stream
 * @Author: JuferBlue
 * @CreateTime: 2024-07-26  15:15
 * @Description: TODO
 * @Version: 1.0
 */
public class Stream_5 {
    public static void main(String[] args) {
        //一堆零散数据
        Stream.of("a","b","c","d","e","f","g","h","i","j","k","l","m").forEach(s->System.out.println(s));
    }
}
