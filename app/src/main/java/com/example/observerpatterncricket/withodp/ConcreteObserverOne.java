package com.example.observerpatterncricket.withodp;

import android.util.Log;

public class ConcreteObserverOne implements Observer{

    @Override
    public void updatedScore(int score) {
        Log.v(this.getClass().getName(), "===>>>: "+score);
    }
}
