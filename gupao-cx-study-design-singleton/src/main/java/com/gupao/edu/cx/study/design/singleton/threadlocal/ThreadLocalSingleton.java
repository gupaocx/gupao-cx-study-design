package com.gupao.edu.cx.study.design.singleton.threadlocal;

/**
 * <Description> <br>
 *
 * @author caixing<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/3/16 13:21 <br>
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> threadLocal = ThreadLocal.withInitial(ThreadLocalSingleton::new);

    private ThreadLocalSingleton() {

    }

    public static ThreadLocalSingleton getInstance() {
        return threadLocal.get();
    }

}
