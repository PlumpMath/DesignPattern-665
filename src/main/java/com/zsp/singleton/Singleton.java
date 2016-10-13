package com.zsp.singleton;

/**
 * Created by zsp-pc on 2016/10/13.
 */

/**
 * 饿汉式单例
 */
public class Singleton {

    private static final Singleton singleton = new Singleton();

    // 限制产生多个对象
    private Singleton() {

    }

    // 使用该方法获取对象
    public static Singleton getInstance() {
        return singleton;
    }

    public void doSomething() {
        System.out.println(singleton.hashCode());
    }
}
