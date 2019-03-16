package com.gupao.edu.cx.study.design.singleton.inner;

/**
 * <Description> <br>
 *
 * @author caixing<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/3/16 12:58 <br>
 */
public class InnerClassSingleton {

    private InnerClassSingleton() {
    }

    public static InnerClassSingleton getInstance() {
        return InnerClassSingletonHolder.INSTANCE;
    }

    public static class InnerClassSingletonHolder {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

}
