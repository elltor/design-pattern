package com.elltor.designpattern.interator;

public class Main {
    public static void main(String[] args) {
        ConcreteIterableObject c = new ConcreteIterableObject();
        for(int i=0;i<10;i++){
            c.setElement(i,"object-"+(i+1));
        }

        Iterator it = new ConcreteIterator(c);
        while(it.hasNext()){
            System.out.println(it.currentElement()+" 拿到了");
            it.next();
        }

    }
}
