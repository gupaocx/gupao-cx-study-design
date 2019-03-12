package com.gupao.edu.cx.study.design.factory.abstracted;

import org.junit.Test;

import static org.junit.Assert.*;

public class AuthFactoryTest {

    @Test
    public void getAuth1() {
        AuthFactory authFactory = new WindowsAuthFactory();
        authFactory.getAuth1();
        authFactory = new LinuxAuthFactory();
        authFactory.getAuth2();
    }

    @Test
    public void getAuth2() {
        AuthFactory authFactory = new WindowsAuthFactory();
        authFactory.getAuth2();
    }
}