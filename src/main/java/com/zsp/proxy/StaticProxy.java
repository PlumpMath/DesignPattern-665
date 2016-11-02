package com.zsp.proxy;

/**
 * Created by Administrator on 2016/10/29.
 */
public class StaticProxy implements Subject {

    private Subject subject = null;

    public StaticProxy(Subject subject) {
        this.subject = subject;
    }

    public void doSomething(String str) {
        this.before();
        this.subject.doSomething(str);
        this.after();
    }

    private void before() {
        // do something
    }

    private void after() {
        // do something
    }
}
