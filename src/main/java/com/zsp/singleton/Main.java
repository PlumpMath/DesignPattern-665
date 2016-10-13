package com.zsp.singleton;

/**
 * Created by zsp-pc on 2016/10/13.
 */
public class Main {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.doSomething();

        Singleton singleton2 = Singleton.getInstance();
        singleton2.doSomething();
    }
}
