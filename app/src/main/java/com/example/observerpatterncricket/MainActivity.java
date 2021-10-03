package com.example.observerpatterncricket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.observerpatterncricket.withodp.ConcreteObserverOne;
import com.example.observerpatterncricket.withodp.ConcreteObserverTwo;
import com.example.observerpatterncricket.withodp.Observer;
import com.example.observerpatterncricket.withodp.Subject;
import com.example.observerpatterncricket.withoutodp.ObserveOne;
import com.example.observerpatterncricket.withoutodp.ObserveTwo;
import com.example.observerpatterncricket.withoutodp.Score;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Without Observer design pattern
        ObserveOne observeOne = new ObserveOne();
        ObserveTwo observeTwo = new ObserveTwo();
        Score  score = new Score(observeOne,observeTwo);
        score.updateObserves(100);

        //With Observer design pattern
        Subject subject = new Subject();
        Observer observerOne =  new ConcreteObserverOne();
        subject.Subscribe(observerOne);

        Observer observerTwo = new ConcreteObserverTwo();
        subject.Subscribe(observerTwo);

        subject.update(50);

    }
}