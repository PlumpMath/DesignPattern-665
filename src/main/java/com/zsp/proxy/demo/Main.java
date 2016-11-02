package com.zsp.proxy.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2016/10/30.
 */
public class Main {

    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");

        InvocationHandler handler = new GamePlayIH(player);

        ClassLoader cl = player.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer)Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);

        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrade();
    }
}
