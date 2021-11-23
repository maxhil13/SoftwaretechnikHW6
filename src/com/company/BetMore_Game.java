package com.company;

import java.util.Scanner;

public class BetMore_Game {
    public int cardNumberComputer;
    public int cardNumberPlayer;
    int versuche = 0;

    public int play(boolean isComputer) {
        if (isComputer) {
            cardNumberComputer = Shuffle.pick_card();
            return cardNumberComputer;
        } else {
            cardNumberPlayer = Shuffle.pick_card();
            anotherTry();
            return cardNumberPlayer;
        }
    }

    public String findWinner(Player computer, Player player) {
        if (computer.cardNumber > player.cardNumber) {
            return "Computer";
        } else if (computer.cardNumber < player.cardNumber) {
            return "Player";
        } else {
            return "Draw";
        }
    }

    public void anotherTry() {

        System.out.println("Du hast eine " + cardNumberPlayer + " gezogen. Möchtest du es erneut versuchen? (ja: 1, nein: beliebige andere Zahl) Versuche: " + (versuche) + " von 5.");
        Scanner in = new Scanner(System.in);
        int input = -1;

        if (in.hasNextInt()) {
            input = in.nextInt();
        } else {
            System.err.println("Bitte nur Zahlen eingeben.");
            anotherTry();
        }

        if (versuche < 5) {
            if (input == 1 && versuche < 5) {
                versuche++;
                play(false);
                in.close();
            } else {
                in.close();
            }
        }
    }
}
