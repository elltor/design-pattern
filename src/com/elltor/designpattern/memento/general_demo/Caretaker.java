package com.elltor.designpattern.memento.general_demo;

/**
 * 管理类
 */
public class Caretaker {
    private Memento memento;

    /**
     * 获取备忘录
     * @return
     */
    public Memento getMemento() {
        return memento;
    }

    /**
     * 设置备忘录
     * @param memento
     */
    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
