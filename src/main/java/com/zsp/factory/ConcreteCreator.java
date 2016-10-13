package com.zsp.factory;

/**
 * Created by zsp-pc on 2016/10/13.
 */
public class ConcreteCreator extends Creator {

    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;

        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return (T)product;
    }
}
