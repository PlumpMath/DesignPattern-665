package com.zsp.handle.demo;

/**
 * Created by zsp-pc on 2016/11/25.
 */
public abstract class Handler {
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;

    private int level = 0;

    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }

    public final void handleMessage(IWomen women) {
        if(women.getType() == this.level) {
            this.response(women);
        } else {
            if(this.nextHandler != null) {
                this.nextHandler.handleMessage(women);
            } else {
                System.out.println("");
            }
        }
    }

    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    protected abstract void response(IWomen women);
}
