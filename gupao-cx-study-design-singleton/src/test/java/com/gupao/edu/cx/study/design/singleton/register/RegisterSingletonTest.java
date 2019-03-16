package com.gupao.edu.cx.study.design.singleton.register;

import com.gupao.edu.cx.study.design.core.util.ExecutorThread;
import org.junit.Test;

public class RegisterSingletonTest {

    @Test
    public void testRegisterSingleton() throws InterruptedException {
        long start = System.currentTimeMillis();
        ExecutorThread.execute(()->{
            com.gupao.edu.cx.study.design.singleton.register.Test registerSingleton = (com.gupao.edu.cx.study.design.singleton.register.Test) RegisterSingleton.getInstance("com.gupao.edu.cx.study.design.singleton.register.Test");
            System.out.println(System.currentTimeMillis()+" : "+registerSingleton);
        },100,6);
        System.out.println("共耗时：" + (System.currentTimeMillis() - start) + "ms");
    }

}