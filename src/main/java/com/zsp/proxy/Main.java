package com.zsp.proxy;

import java.lang.reflect.InvocationHandler;

/**
 * Created by Administrator on 2016/10/30.
 */
public class Main {

    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
        proxy.doSomething("Finish");
    }
}
