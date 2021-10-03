package com.example.observerpatterncricket.withodp;

import android.util.Log;

public class ConcreteObserverTwo implements Observer {
    @Override
    public void updatedScore(int score) {
        Log.v(this.getClass().getName(),"===>>>:"+score);

    }
}
