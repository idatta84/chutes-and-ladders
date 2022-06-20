package com.priceline.chutes;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoardSquareTest {

    @Test
    public void aChuteShouldSkipSquaresReversed(){
        BoardSquare square = new BoardSquare(true, false, 10);
        assertEquals(-10, square.getNumberSquaresToSkip());
    }

    @Test
    public void aLadderShouldSkipSquares(){
        BoardSquare square = new BoardSquare(false, true, 10);
        assertEquals(10, square.getNumberSquaresToSkip());
    }

    @Test
    public void aNormalSquareShouldNotSkipSquares(){
        BoardSquare square1 = new BoardSquare(false, false, 10);
        assertEquals(0, square1.getNumberSquaresToSkip());
        BoardSquare square2 = new BoardSquare();
        assertEquals(0, square2.getNumberSquaresToSkip());
    }
}
