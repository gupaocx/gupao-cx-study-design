package com.gupao.edu.cx.study.design.strategy;

import static org.junit.Assert.*;

public class AuthTest {

    @org.junit.Test
    public void auth() {
        AuthFactory authFactory = new AuthFactory();
        authFactory.getAuth("v2");
    }
}