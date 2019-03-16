package com.gupao.edu.cx.study.design.singleton.lazy;

import com.gupao.edu.cx.study.design.core.util.ExecutorThread;
import org.junit.Test;

public class LazySingletonTest {

    @Test
    public void testLazySingleton() throws InterruptedException {
        long start = System.currentTimeMillis();
        ExecutorThread.execute(() -> {
            LazySingleton lazySingleton = LazySingleton.getInstance();
            System.out.println(System.currentTimeMillis() + " : " + lazySingleton);
        }, 100, 6);
        System.out.println("共耗时：" + (System.currentTimeMillis() - start) + " ms");
    }

}