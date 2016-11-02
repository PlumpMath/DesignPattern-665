package com.zsp.proxy.demo;

/**
 * Created by Administrator on 2016/10/30.
 */
public class GamePlayer implements IGamePlayer {

    private String name = "";

    public GamePlayer(String name) {
        this.name = name;
    }

    public void login(String user, String password) {
        System.out.println("登陆名为" + user + "的用户" + this.name + "登陆成功！");
    }

    public void killBoss() {
        System.out.println(this.name + "在打怪！");
    }

    public void upgrade() {
        System.out.println(this.name + "又升了一级！");
    }
}
