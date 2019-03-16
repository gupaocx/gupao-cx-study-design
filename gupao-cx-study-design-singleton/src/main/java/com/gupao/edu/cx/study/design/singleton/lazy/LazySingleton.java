package com.gupao.edu.cx.study.design.singleton.lazy;

/**
 * <Description> <br>
 *
 * @author caixing<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/3/16 12:48 <br>
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton(){}

    public static LazySingleton getInstance() {
        synchronized (LazySingleton.class) {
            if (lazySingleton == null) {
                lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;
    }

}
