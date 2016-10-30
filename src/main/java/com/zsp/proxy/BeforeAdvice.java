package com.zsp.proxy;

/**
 * Created by Administrator on 2016/10/30.
 */
public class BeforeAdvice implements IAdvice {

    public void exec() {
        System.out.println("前置通知被执行了！");
    }
}
