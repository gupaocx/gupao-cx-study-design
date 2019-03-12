package com.gupao.edu.cx.study.design.factory.abstracted;

public class WindowsAuthFactory implements AuthFactory {
    public String getAuth1() {
        return " windows auth1 授权";
    }

    public String getAuth2(){
        return " windows auth2 授权";
    }
}
