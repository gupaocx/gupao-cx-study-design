package com.gupao.edu.cx.study.design.delegate;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Leader {
    private static Map<String,IEmployee> map = new ConcurrentHashMap<String, IEmployee>();

    public Leader(){
        map.put("A",new EmployeeA());
        map.put("B",new EmployeeB());
    }

    public void doing(String command){
        map.get(command).doingSth(command);
    }

}
