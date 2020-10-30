package com.elltor.designpattern.memento.game_demo;

public class Main {
    public static void main(String[] args) {
        //初始游戏状态
        GameState origin = new GameState();
        origin.initial();

        System.out.println("任务之前的状态:");
        origin.showState();
        System.out.println("--------------------");

        //进度保存
        GameState stateBackup = new GameState();
        stateBackup.setChapter(origin.getChapter());
        stateBackup.setCoordinate(origin.getCoordinate());
        stateBackup.setHp(origin.getHp());
        stateBackup.setMp(origin.getMp());
        stateBackup.setLevel(origin.getLevel());

        //去做任务,任务失败
        System.out.println("任务失败后:");
        origin.taskTo();
        origin.showState();
        System.out.println("--------------------");


        System.out.println("回档后:");
        origin.setChapter(stateBackup.getChapter());
        origin.setCoordinate(stateBackup.getCoordinate());
        origin.setHp(stateBackup.getHp());
        origin.setMp(stateBackup.getMp());
        origin.setLevel(stateBackup.getLevel());
        origin.showState();
    }
}
