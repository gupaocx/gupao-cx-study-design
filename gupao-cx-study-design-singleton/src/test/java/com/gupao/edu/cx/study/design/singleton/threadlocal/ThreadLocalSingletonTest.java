package com.gupao.edu.cx.study.design.singleton.threadlocal;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThreadLocalSingletonTest {

    @Test
    public void testThreadLocal(){

        System.out.println(Thread.currentThread().getName() +":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() +":" + ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(()->{
            ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
            System.out.println(Thread.currentThread().getName()+" : "+singleton);
        });

        Thread t2 = new Thread(()->{
            ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
            System.out.println(Thread.currentThread().getName()+" : "+singleton);
        });

        t1.start();
        t2.start();

    }

}