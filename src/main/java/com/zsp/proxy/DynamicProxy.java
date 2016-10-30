package com.zsp.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2016/10/30.
 */
public class DynamicProxy<T> {

    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) {
        if(true) {
            (new BeforeAdvice()).exec();
        }
        return (T)Proxy.newProxyInstance(loader, interfaces, h);
    }
}
