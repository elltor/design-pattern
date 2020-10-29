package com.elltor.designpattern.adapter;

public class Adapter110V extends PowerPort110V implements Adapter {
    NoteBook noteBook = new NoteBook();

    @Override
    public void powerSupply() {
        super.powerSupply();
        System.out.println("适配器转换成了笔记本需要的.");
        noteBook.work();
    }
}
