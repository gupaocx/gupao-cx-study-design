package com.gupao.edu.cx.study.design.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <Description> <br>
 *
 * @author caixing<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/3/16 13:05 <br>
 */
public class RegisterSingleton {
    private RegisterSingleton(){}

    public static Map<String,Object> ioc = new ConcurrentHashMap<>();

    public static Object getInstance(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        synchronized (ioc){
            if(!ioc.containsKey(className)){
                Object object = null;
                object = Class.forName(className).newInstance();
                ioc.put(className,object);
                return object;
            } else {
                return ioc.get(className);
            }
        }
    }

}
