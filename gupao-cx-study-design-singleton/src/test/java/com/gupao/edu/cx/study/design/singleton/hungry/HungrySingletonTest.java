package com.gupao.edu.cx.study.design.singleton.hungry;

import com.gupao.edu.cx.study.design.core.util.ExecutorThread;
import org.junit.Test;

import static org.junit.Assert.*;

public class HungrySingletonTest {

    @Test
    public void testHungrySingleton() throws InterruptedException {
        long start = System.currentTimeMillis();
        ExecutorThread.execute(()->{
            HungrySingleton hungrySingleton = HungrySingleton.getInstance();
            System.out.println(System.currentTimeMillis()+" : " +hungrySingleton);
        },100,6);
        System.out.println("共耗时："+(System.currentTimeMillis()-start)+" ms");
    }

}