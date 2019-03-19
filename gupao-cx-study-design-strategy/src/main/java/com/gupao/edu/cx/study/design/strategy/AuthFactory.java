package com.gupao.edu.cx.study.design.strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AuthFactory {
    public static Map<String, Auth> map = new ConcurrentHashMap<String, Auth>();

    static {
        map.put("v1", new AuthV1());
        map.put("v2", new AuthV2());
    }

    public void getAuth(String version) {
        map.get(version).auth();
    }

}
