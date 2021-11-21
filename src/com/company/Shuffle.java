package com.company;

public class Shuffle {
    public static int pick_card() {
        int lowestNumber = 1;
        int highestNumber = 100;
        return (int) (Math.random() * ((highestNumber - lowestNumber) + 1)) + lowestNumber;
    }
}
