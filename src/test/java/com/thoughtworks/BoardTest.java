package com.thoughtworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
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
    void givenBoard_WhenPlay_ThenPlayerOneWillWin() {

        Player playerOne = new Player();
        Player playerTwo = new Player();

        Board board = new Board(playerOne, playerTwo);
        assertNull(board.winner());
    }

    @Test
    void givenMove_WhenPlay_ThenItShouldPlayTheMove() {

        Player playerOne = new Player();
        Player playerTwo = new Player();

        Board board = new Board(playerOne, playerTwo);
        assertDoesNotThrow(() -> board.move(2, playerOne));
    }

    @Test
    void givenAlreadyPlayedMove_WhenPlay_ThenItShouldNotAbleToPlay() {

        Player playerOne = new Player();
        Player playerTwo = new Player();

        Board board = new Board(playerOne, playerTwo);
        playerOne.move(2);
        Assertions.assertThrows(PositionAlreadyOccupiedException.class, () -> {
            board.move(2, playerOne);
        });
    }
}
