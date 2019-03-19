package com.gupao.edu.cx.study.design.delegate;

public class Boss {

    public void command(String command,Leader leader){
        leader.doing(command);
    }

}
