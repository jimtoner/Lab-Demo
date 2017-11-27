package com.zqf.lab.observer;

import java.util.ArrayList;
import java.util.List;

public class AppObserver {
    public static void main(String[] args){
        Subject subject=new MySubject();
        subject.addObserver(new Observer() {
            @Override
            public void update() {
                System.out.println("1......");
            }
        });
        subject.addObserver(new Observer() {
            @Override
            public void update() {
                System.out.println("2......");
            }
        });

        subject.notifyObserver();
    }


}
interface Observer{
    void update();
}

interface Subject{
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}

class MySubject implements Subject{
    private List<Observer> list;
    public MySubject(){list=new ArrayList<>();}
    @Override
    public void addObserver(Observer observer) {
        this.list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        this.list.forEach(x->{
            x.update();
        });
    }
}
