package com.elltor.designpattern.adapter;

public class Adapter220V extends PowerPort220V implements Adapter {
    private NoteBook noteBook = new NoteBook();

    @Override
    public void powerSupply() {
        super.powerSupply();
        System.out.println("适配器将电源转换成笔记本需要的.");
        noteBook.work();
    }
}
