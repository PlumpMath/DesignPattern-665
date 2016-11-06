package com.zsp.mediator;

/**
 * Created by Administrator on 2016/11/6.
 */
public class ConcreteMediator extends Mediator {

    public void doSomething1() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }

    public void doSomething2() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }
}
