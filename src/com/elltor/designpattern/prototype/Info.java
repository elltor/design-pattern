package com.elltor.designpattern.prototype;


/**
 * 基本信息类
 * 问题: 所有引用类在浅拷贝是均不被复制;
 */
public class Info implements Cloneable {
    private String name;
    private int age;
    private Nation nat;

    public Info(String name, int age,Nation nat) {
        this.name = name;
        this.age = age;
        this.nat = nat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Nation getNat() {
        return nat;
    }

    public void setNat(Nation nat) {
        this.nat = nat;
    }

    @Override
    public String toString() {
        return "Info{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nat=" + nat +
                '}';
    }

    @Override
    protected Object clone() {
//        不能直接返回克隆对象, 浅拷贝时复制引用成员遍历的引用地址而不是对象!
//        return super.clone();
        Info info = new Info(this.name, this.age,this.nat);
        return info;
    }
}
