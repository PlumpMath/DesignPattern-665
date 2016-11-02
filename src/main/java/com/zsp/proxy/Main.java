package com.zsp.proxy;

import java.lang.reflect.InvocationHandler;

/**
 * Created by Administrator on 2016/10/30.
 */
public class Main {

    public static void main(String[] args) {
        Subject subject = new RealSubject();

        InvocationHandler handler = new MyInvocationHandler(subject);

        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(),
                handler);

        proxy.doSomething("Finish");
    }
}
