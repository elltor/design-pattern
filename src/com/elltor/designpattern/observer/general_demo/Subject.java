package com.elltor.designpattern.observer.general_demo;

import java.util.ArrayList;
import java.util.List;

//抽象通知类
public abstract class Subject {
    private List<Observer> observerList = new ArrayList<>();

    //进入
    public void attach(Observer observer){
        observerList.add(observer);
    }

    //离开
    public void leave(Observer observer){
        observerList.remove(observer);
    }

    //通知接收对象
    public void notifySubject(){
        for(Observer o : observerList){
            o.update();
        }
    }



}
