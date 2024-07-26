package stream;

import java.util.Arrays;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: stream
 * @Author: JuferBlue
 * @CreateTime: 2024-07-26  15:12
 * @Description: TODO
 * @Version: 1.0
 */
public class Stream_4 {
    public static void main(String[] args) {
        //数组的stream流
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        String[] strings = {"a","b","c","d","e","f","g","h","i","j"};

        //通过Arrays获取stream流
        Arrays.stream(arr).forEach(s->System.out.println(s));
        Arrays.stream(strings).forEach(s->System.out.println(s));
    }
}
