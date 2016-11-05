package com.zsp.mediator.demo;

/**
 * Created by zsp-pc on 2016/11/2.
 */
public abstract class AbstractColleague {
    // 中介者
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
