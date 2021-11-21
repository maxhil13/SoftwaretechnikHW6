package com.company;

import java.util.Scanner;

public class Player {
    public int cardNumber;
    public boolean isComputer;
    public BetMore_Game game;
    //
    // public int versuche = 0;

    public Player(boolean isComputer, BetMore_Game game) {
        this.isComputer = isComputer;
        this.game = game;
    }

    public int start() {
        cardNumber = game.play(isComputer);
        return cardNumber;
    }


}
