package com.zsp.mediator.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsp-pc on 2016/11/2.
 */
public class Purchase extends AbstractColleague {

    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    public void buyIBMComputer(int number) {
        super.mediator.execute("purchase.bug", number);
    }

    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }
}
