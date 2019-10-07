package com.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {

    @Test
    void givenBoard_WhenPlay_ThenPlayerTwoWillWin() {
        int[][] gamePoints = {{1, 2, 3}};

        Player player = new Player();

        Board board = new Board(gamePoints, player);
        assertEquals(null, board.winner());
    }

//    @Test
//    void givenBoard_WhenPlay_ThenPlayerOneShouldWin() {
//        int[][] gamePoints = {{1, 2, 1}, {1, 0, 1}, {1, 2, 0}};
//
//        Player playerOne = new Player();
//        Player playerTwo = new Player();
//
//        Board board = new Board(gamePoints, playerOne, playerTwo);
//        assertEquals(playerOne, board.winner());
//    }
//
//    @Test
//    void givenBoard_WhenPlay_ThenPlayerOneWillWin() {
//        int[][] gamePoints = {{1, 1, 2}, {0, 1, 1}, {1, 1, 2}};
//
//        Player playerOne = new Player();
//        Player playerTwo = new Player();
//
//        Board board = new Board(gamePoints, playerOne, playerTwo);
//        assertEquals(playerOne, board.winner());
//    }

}
