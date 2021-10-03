package com.example.observerpatterncricket.withoutodp;

public class Score {

    private int run = 10;

    private ObserveOne observeOne;
    private ObserveTwo observeTwo;

    public Score(ObserveOne one, ObserveTwo two) {
        this.observeOne = one;
        this.observeTwo = two;
    }

    public void updateObserves(int score) {
        observeOne.updatedScore(score);
        observeTwo.updatedScore(score);

    }
}
