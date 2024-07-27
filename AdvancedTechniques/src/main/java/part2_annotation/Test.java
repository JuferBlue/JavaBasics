package part2_annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: part2_annotation
 * @Author: JuferBlue
 * @CreateTime: 2024-07-03  22:21
 * @Description: TODO
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("part2_annotation.InitDemo");
        Method[] methods = clazz.getMethods();
        if(methods != null){
            //扫描所有的方法
            for (Method method : methods) {
                //判断该方法上是否有 注解
                boolean isInitMethod = method.isAnnotationPresent(MyAnnotation.class);
                 if(isInitMethod){
                     method.invoke(clazz.getConstructor(null).newInstance(null),null);
                 }
            }
        }
    }
}
