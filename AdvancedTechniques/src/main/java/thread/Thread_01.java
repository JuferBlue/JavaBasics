package thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: thread
 * @Author: JuferBlue
 * @CreateTime: 2024-07-26  23:58
 * @Description: TODO
 * @Version: 1.0
 */
public class Thread_01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //并发：同一时刻多个指令在CPU上交替执行
        //并行：多个指令同时执行

        //多线程的实现方式1：继承Thread类
        //1.创建一个继承Thread类的子类
        //2.重写Thread类的run方法，将线程要执行的代码放入run方法中
        //3.创建Thread类的子类对象，并启动线程
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setName("线程1");
        t2.setName("线程2");//给线程设置名字
        t1.start();
        t2.start();


        //多线程的实现方式2：实现Runnable接口
        //1.创建一个实现了Runnable接口的类
        //2.实现类中重写Runnable接口的run方法，将线程要执行的代码放入run方法中
        //3.创建Runnable接口的实现类对象
        //4.创建Thread类对象，并启动线程
        MyThread1 t3 = new MyThread1();
        Thread t4 = new Thread(new MyThread1());
        t4.setName("线程3");
        t4.start();

        //多线程的实现方式3：实现Callable接口和FutureTask类
        //1.创建一个实现了Callable接口的类
        //2.重写call方法，将线程要执行的代码放入call方法中(返回值表示线程运行的结果)
        //3.创建Callable接口的实现类对象
        //4.创建FutureTask类对象，将Callable接口的实现类对象作为构造方法的参数
        //5.创建Thread类对象，将FutureTask类对象作为构造方法的参数
        MyThread2 t5 = new MyThread2();
        FutureTask<Integer> futureTask = new FutureTask<>(t5);
        Thread t6 = new Thread(futureTask);
        t6.setName("线程4");
        t6.start();

        Integer result = futureTask.get();
        System.out.println("线程4的计算结果为：" + result);
    }
}
