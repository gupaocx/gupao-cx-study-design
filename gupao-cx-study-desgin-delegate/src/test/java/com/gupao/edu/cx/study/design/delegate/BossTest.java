package com.gupao.edu.cx.study.design.delegate;

import org.junit.Test;

import static org.junit.Assert.*;

public class BossTest {

    @Test
    public void test(){
        Boss boss = new Boss();
        boss.command("B",new Leader());
    }
}