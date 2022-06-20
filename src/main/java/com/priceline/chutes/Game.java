package com.priceline.chutes;

import java.util.Random;

public class Game {

    private Random random = new Random();

    public Player playGame(String[] names){
        Player[] players = new Player[names.length];
        int position = 0;
        for(String name:names){
            players[position++] = new Player(name);
            //System.out.println(position-1+" : "+name);
        }
        Board board = new Board();

        while(true){
            for (Player currentPlayer : players) {
                int spinResult = spin();
                int nextPosition = currentPlayer.getPosition() + spinResult;
                //System.out.println(currentPlayer.getName());
                if (nextPosition > 100){
                    //System.out.println(currentPlayer.getName()+":"+currentPlayer.getPosition());
                    continue;
                }
                BoardSquare nextSquare = board.getSquareAtPosition(nextPosition);
                nextPosition += nextSquare.getNumberSquaresToSkip();
                if (nextPosition < 100) {
                    currentPlayer.setPosition(nextPosition);
                } else if (nextPosition == 100) {
                    return currentPlayer;//The winner!
                }
            }
        }
    }
    private int spin(){
        return random.nextInt(6) + 1;
    }
}
