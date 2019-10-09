package com.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

class BoardTest {

    @Test
    void givenBoard_WhenPlay_ThenPlayerTwoWillWin() {

        Player playerOne = new Player();
        Player playerTwo = new Player();

        Board board = new Board(playerOne, playerTwo);
        assertNull(board.winner());
    }

    @Test
    void givenBoard_WhenPlay_ThenPlayerOneShouldWin() {

        Player playerOne = new Player();
        Player playerTwo = new Player();

        Board board = new Board(playerOne, playerTwo);
        assertNull(board.winner());
    }

    @Test
    void givenBoard_WhenPlay_ThenPlayerOneWillWin() {

        Player playerOne = new Player();
        Player playerTwo = new Player();

        Board board = new Board(playerOne, playerTwo);
        assertNull(board.winner());
    }
}
