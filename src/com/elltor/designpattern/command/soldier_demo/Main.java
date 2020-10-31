package com.elltor.designpattern.command.soldier_demo;

public class Main {
    public static void main(String[] args) {
        //招募士兵训练士兵
        Soldier soldiers = new Soldier();
        Command togetherCmd = new TogetherCommand(soldiers);
        Command fightCmd = new FightCommand(soldiers);
        Command cableBoatCmd = new CableBoatCommand(soldiers);

        //设置传令管
        Herald herald = new Herald();

        //部队集合
        herald.setCommand(togetherCmd);
        herald.notification();

        //开始战斗
        herald.setCommand(fightCmd);
        herald.notification();

        //铁索连舟
        herald.setCommand(cableBoatCmd);
        herald.notification();
    }

}
