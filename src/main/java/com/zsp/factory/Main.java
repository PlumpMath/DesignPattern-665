package com.zsp.factory;

/**
 * Created by zsp-pc on 2016/10/13.
 */
public class Main {

    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product1 = creator.createProduct(ConcreteProduct1.class);
        Product product2 = creator.createProduct(ConcreteProduct2.class);
    }
}
