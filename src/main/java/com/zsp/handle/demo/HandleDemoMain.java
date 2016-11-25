package com.zsp.handle.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by zsp-pc on 2016/11/25.
 */
public class HandleDemoMain {

    public static void main(String[] args) {
        Random rand = new Random();
        List<IWomen> womenList = new ArrayList<IWomen>();
        for(int i = 0; i < 5; i++) {
            womenList.add(new Women(rand.nextInt(4), "我要出去逛街"));
        }

        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        father.setNext(husband);
        husband.setNext(son);

        for(IWomen women : womenList) {
            father.handleMessage(women);
        }
    }
}
