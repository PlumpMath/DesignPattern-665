package com.zsp.proxy;

/**
 * Created by Administrator on 2016/10/29.
 */
public class RealSubject implements Subject {

    public void doSomething(String str) {
        System.out.println("do something!---->" + str);
    }
}
