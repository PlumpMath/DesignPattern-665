package com.zsp.mediator;

/**
 * Created by Administrator on 2016/11/6.
 */
public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod1() {
        // 处理自己的业务逻辑
    }

    public void depMothod1() {
        super.mediator.doSomething1();
    }
}
