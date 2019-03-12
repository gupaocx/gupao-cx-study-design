package com.gupao.edu.cx.study.design.factory.abstracted;

public class LinuxAuthFactory implements AuthFactory {

    public String getAuth1() {
        return "linux auth1 授权";
    }

    public String getAuth2() {
        return "linux auth2 授权";
    }
}
