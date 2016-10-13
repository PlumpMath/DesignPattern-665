package com.zsp.factory;

/**
 * Created by zsp-pc on 2016/10/13.
 */
public abstract class Creator {

    public abstract <T extends Product> T createProduct(Class<T> c);
}
