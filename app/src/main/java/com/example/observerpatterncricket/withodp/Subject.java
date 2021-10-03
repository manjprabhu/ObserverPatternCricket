package com.example.observerpatterncricket.withodp;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observerList = new ArrayList<>();

    public Subject() {

    }

    public void Subscribe(Observer observer) {
        observerList.add(observer);
    }

    public void UnSubscribe(Observer observer) {
        observerList.remove(observer);
    }

    public void update(int score) {
        for (Observer observer: observerList) {
             observer.updatedScore(score);
        }
    }
}
