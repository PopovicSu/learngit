package Annotation.anno1;

import java.lang.reflect.Method;

/**
 * Created by shaobo.su on 2017/7/19.
 */
public class TestTool {
    public static void main(String[] args){
        Class clazz=ForumService.class;
        Method[] methods=clazz.getDeclaredMethods();
        System.out.println(methods.length);
        for (Method method : methods) {
            NeedTest needTest = method.getAnnotation(NeedTest.class);
            if(needTest!=null){
                if(needTest.value()==true){
                    System.out.println(method.getName()+"   need test");
                }
                else{
                    System.out.println(method.getName() + " need not test");
                }
            }
        }
    }
}
