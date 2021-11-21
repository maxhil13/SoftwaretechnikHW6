package com.company;

public class Game_Chair_Main {
    public static int cardNumberComputer;
    public static int cardNumberPlayer;
    public static String winner;

    public static BetMore_Game game;

    public static Player computer;
    public static Player player;

    public static void main(String[] args) {
        game = new BetMore_Game();
        computer = new Player(true, game);
        player = new Player(false, game);

        cardNumberComputer = computer.start();

        cardNumberPlayer = player.start();

        System.out.print("Computer: ");
        System.out.println(cardNumberComputer);

        System.out.print("Player: ");
        System.out.println(cardNumberPlayer);

        winner = game.findWinner(computer, player);
        System.out.print("Winner: ");
        System.out.println(winner);
    }
}
