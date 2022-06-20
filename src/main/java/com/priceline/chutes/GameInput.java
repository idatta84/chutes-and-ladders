package com.priceline.chutes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GameInput {

    public String[] getPlayerNames() throws Exception{
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String[] playerNames = null;
        while(null == playerNames){
            System.out.println("This game can be played with 2 to 4 players.");
            System.out.println("Please enter 2-4 player names separated by commas and then press enter");
            // Reading data using readLine
            playerNames = reader.readLine().trim().split(",");
            if(playerNames.length<2){
                playerNames = null;
            }
        }
        return playerNames;
    }
}
