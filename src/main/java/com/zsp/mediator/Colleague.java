package com.zsp.mediator;

/**
 * Created by Administrator on 2016/11/6.
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
 }
