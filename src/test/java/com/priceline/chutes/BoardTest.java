package com.priceline.chutes;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BoardTest {

    @Test
    public void aBoardIsCreatedSuccessfully(){
        Board board = new Board();
        assertEquals(100, board.squares.size());
        assertNotNull(board.getSquareAtPosition(51));
        assertEquals(16, board.getSquareAtPosition(51).getNumberSquaresToSkip());
        assertNotNull(board.getSquareAtPosition(87));
        assertEquals(-63, board.getSquareAtPosition(87).getNumberSquaresToSkip());
        assertNotNull(board.getSquareAtPosition(87));
        assertEquals(0, board.getSquareAtPosition(10).getNumberSquaresToSkip());
    }
}
