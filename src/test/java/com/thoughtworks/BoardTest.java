package com.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {

    @Test
    void givenBoard_WhenPlay_ThenPlayerTwoShouldWin() {
        int arr[][] = {{1, 2, 1}, {0, 2, 0}, {1, 2, 0}};

        Player player = new Player();
        Player playerTwo = new Player();

        Board board = new Board(arr, player, playerTwo);
        assertEquals(playerTwo, board.winner());
    }

    @Test
    void givenBoard_WhenPlay_ThenPlayerTwoWillWin() {
        int arr[][] = {{2, 0, 1}, {2, 1, 0}, {2, 2, 0}};

        Player player = new Player();
        Player playerTwo = new Player();

        Board board = new Board(arr, player, playerTwo);
        assertEquals(playerTwo, board.winner());
    }

    @Test
    void givenBoard_WhenPlay_ThenPlayerOneShouldWin() {
        int arr[][] = {{1, 2, 1}, {0, 1, 1}, {1, 2, 1}};

        Player playerOne = new Player();
        Player playerTwo = new Player();

        Board board = new Board(arr, playerOne, playerTwo);
        assertEquals(playerOne, board.winner());
    }

    @Test
    void givenBoard_WhenPlay_ThenPlayerOneWillWin() {
        int arr[][] = {{1, 1, 2}, {0, 1, 1}, {1, 1, 2}};

        Player playerOne = new Player();
        Player playerTwo = new Player();

        Board board = new Board(arr, playerOne, playerTwo);
        assertEquals(playerOne, board.winner());
    }

}
