package com.gupao.edu.cx.study.design.singleton.hungry;

/**
 * <Description> <br>
 *
 * @author caixing<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/3/16 11:18 <br>
 */
public class HungrySingleton {

    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return HUNGRY_SINGLETON;
    }

}
