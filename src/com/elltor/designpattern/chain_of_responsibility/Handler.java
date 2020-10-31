package com.elltor.designpattern.chain_of_responsibility;

public abstract class Handler {
    protected Handler successor;

    //设置授权者
    public void  setSuccessor(Handler successor){
        this.successor = successor;
    }

    public abstract void HandleRequest(int request);

}

