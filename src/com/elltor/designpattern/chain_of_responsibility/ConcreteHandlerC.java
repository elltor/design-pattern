package com.elltor.designpattern.chain_of_responsibility;

public class ConcreteHandlerC extends Handler {

    @Override
    public void HandleRequest(int request) {
        if(request == 3){
            System.out.println(this.getClass().getCanonicalName()+"处理了请求:"+request);
        }else{
            if(this.successor!=null){
                System.out.println(this.getClass().getCanonicalName()+"不满足处理请求, 转入下一个处理者↓");
                this.successor.HandleRequest(request);
            }else {
                System.out.println("无法处理请求:"+request);
            }
        }
    }
}