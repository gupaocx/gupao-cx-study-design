package com.gupao.edu.cx.study.design.singleton.inner;

import com.gupao.edu.cx.study.design.core.util.ExecutorThread;
import org.junit.Test;

public class InnerClassSingletonTest {

    @Test
    public void testInnerClassSingleton() throws InterruptedException {
        long start = System.currentTimeMillis();
        ExecutorThread.execute(() -> {
            InnerClassSingleton innerClassSingleton = InnerClassSingleton.getInstance();
            System.out.println(System.currentTimeMillis() + " : " + innerClassSingleton);
        }, 100, 6);
        System.out.println("共耗时：" + (System.currentTimeMillis() - start) + " ms");
    }

}