package com.priceline.chutes;

public class GameStarter {

        public static void main(String[] args) {
        try {
            String[] playerNames = new GameInput().getPlayerNames();

            Player winner = new Game().playGame(playerNames);

            System.out.println("The winner is: " + winner.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
