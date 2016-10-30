package com.zsp.proxy;

/**
 * Created by Administrator on 2016/10/29.
 */
public class Proxy implements Subject {

    private Subject subject = null;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    private void before() {
        // do something
    }

    private void after() {
        // do something
    }
}
