package com.company;

import java.util.Random;

public class Dice {
    int faceValue;

    Random random = new Random();

    public Dice (int faceValue) {
        this.faceValue  = faceValue;
    }

    public void roll() {
        faceValue = random.nextInt(6) + 1;
    }

    public String toString(){
        return "Diceroll: " + faceValue;
    }
}
