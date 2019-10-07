package com.thoughtworks;

import java.util.ArrayList;

public class Board {

    private int[][] playerMoves;
    private Player player;

    private ArrayList<int[][]> winningMoves = new ArrayList<>();

    Board(int[][] playerMoves, Player player) {
        int[][] moves = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 4, 7}, {2, 5, 8}, {3, 6, 9}, {1, 5, 9}, {3, 5, 7}};
        winningMoves.add(moves);
        this.player = player;
        this.playerMoves = playerMoves;

    }

    public Player winner() {
        if (winningMoves.contains(playerMoves)) {
            return player;
        }
        return null;
    }
}