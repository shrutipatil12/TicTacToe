package com.thoughtworks;

import java.util.Arrays;
import java.util.List;

public class Board {
    private Player playerOne;
    private Player playerTwo;

    private final List<List<Integer>> winningMoves;

    Board(Player playerOne, Player playerTwo) {
        winningMoves = Arrays.asList(

                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9),

                Arrays.asList(1, 4, 7),
                Arrays.asList(2, 5, 8),
                Arrays.asList(3, 6, 9),

                Arrays.asList(1, 5, 9),
                Arrays.asList(3, 5, 7)

        );

        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void move(int positionPlayedAt) throws PositionAlreadyOccupiedException {
        if (isPositionAlreadyOccupied(positionPlayedAt)) {
            throw new PositionAlreadyOccupiedException();
        }

        playerOne.move(positionPlayedAt);
        Player tempPlayer;
        tempPlayer = playerOne;
        playerOne = playerTwo;
        playerTwo = tempPlayer;
    }

    private boolean isPositionAlreadyOccupied(int positionPlayedAt) {
        return playerOne.alreadyMadeMove(positionPlayedAt) || playerTwo.alreadyMadeMove(positionPlayedAt);
    }

    public Player winner() {
        if (playerOne.doesContain(winningMoves)) {
            return playerOne;
        }
        if (playerTwo.doesContain(winningMoves)) {
            return playerTwo;
        }
        return null;
    }
}