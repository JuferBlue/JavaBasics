package thread;

import java.util.concurrent.Callable;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: thread
 * @Author: JuferBlue
 * @CreateTime: 2024-07-27  08:04
 * @Description: TODO
 * @Version: 1.0
 */
public class MyThread2 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        //求1-100的和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
