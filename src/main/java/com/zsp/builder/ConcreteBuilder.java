package com.zsp.builder;

/**
 * Created by Administrator on 2016/10/29.
 */
public class ConcreteProduct extends Builder {

    private Product product = new Product();

    public void setPart() {
        /**
         * 产品类内部逻辑
         */
    }

    public Product buildProduct() {
        return this.product;
    }

}
