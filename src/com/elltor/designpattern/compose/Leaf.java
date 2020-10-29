package com.elltor.designpattern.compose;

public class Leaf extends Component {
    public Leaf(String componentName) {
        super(componentName);
    }

    @Override
    public void add(Component component) {
        System.out.println("叶子节点无法增加节点");
    }

    @Override
    public void remove(Component component) {
        System.out.println("叶子节点无法删除节点");
    }

    @Override
    public void show(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print('+');
        }
        System.out.println(componentName);
    }
}
