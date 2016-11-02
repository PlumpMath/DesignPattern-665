package com.zsp.builder;

/**
 * Created by Administrator on 2016/10/29.
 */
public abstract class Builder {

    // 设置产品的不同部分，已获得不同的产品
    public abstract void setPart();

    public abstract Product buildProduct();
}
