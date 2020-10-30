package com.elltor.designpattern.memento.game_demo;

public class GameState {
    // 角色等级
    private int level;

    // 角色地图坐标
    private int coordinate;

    // 章节
    private int chapter;

    // 角色生命值
    private int hp;

    // 角色魔力值
    private int mp;

    public void showState() {
        System.out.println("游戏信息如下:");
        System.out.println("角色级别:" + level);
        System.out.println("角色作别:" + coordinate);
        System.out.println("角色生命值:" + hp);
        System.out.println("角色魔力值:" + mp);
        System.out.println("当前的章节为:" + chapter);
    }

    public void initial() {
        level = 100;
        chapter = 10;
        coordinate = 999;
        hp = 8000;
        mp = 9000;
    }

    // 做副本任务
    public void taskTo() {
        level = 100;
        chapter = 10;
        coordinate = 999;
        hp = 0;
        mp = 0;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(int coordinate) {
        this.coordinate = coordinate;
    }

    public int getChapter() {
        return chapter;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }
}
