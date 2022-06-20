package com.priceline.chutes;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GameTest {

    @Test
    public void aPlayerIsReturned(){
        Game game = new Game();
        Player player = game.playGame(new String[]{"John", "Peter", "Jerry"});
        assertNotNull(player);
    }
}
