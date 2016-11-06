package com.zsp.mediator;

/**
 * Created by Administrator on 2016/11/6.
 */
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod2() {
        // 处理自己的业务逻辑
    }

    public void depMethod2() {
        super.mediator.doSomething2();
    }
}
