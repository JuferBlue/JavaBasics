package thread;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: thread
 * @Author: JuferBlue
 * @CreateTime: 2024-07-27  07:56
 * @Description: TODO
 * @Version: 1.0
 */
public class MyThread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
