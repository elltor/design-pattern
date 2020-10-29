package com.elltor.designpattern.compose;

public class Main {
    public static void main(String[] args) {
        Composite root = new Composite("树根");
        root.add(new Leaf("叶子A"));
        root.add(new Leaf("叶子B"));

        Composite composite1 = new Composite("节点X");
        composite1.add(new Leaf("叶子XA"));
        composite1.add(new Leaf("叶子XB"));

        Composite composite2 = new Composite("节点Y");
        composite2.add(new Leaf("叶子YA"));
        composite2.add(new Leaf("叶子YB"));

        composite1.add(composite2);
        root.add(composite1);

        root.show(1);
    }
}
