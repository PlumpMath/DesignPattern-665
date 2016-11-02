package com.zsp.builder;

/**
 * Created by Administrator on 2016/10/29.
 */
public class Director {

    private Builder builder = new ConcreteBuilder();

    public Product getAProduct() {
        builder.setPart();
        return builder.buildProduct();
    }
}
