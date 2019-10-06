package com.thoughtworks;

public class Board {
    int arr[][];
    Player playerOne;
    Player playerTwo;

    Board(int[][] arr, Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.arr = arr;
    }

    public Player winner() {
        if ((arr[0][0] == 2 && arr[0][1] == 2 && arr[0][2] == 2) ||
                (arr[1][0] == 2 && arr[1][1] == 2 && arr[1][2] == 2) ||
                (arr[2][0] == 2 && arr[2][1] == 2 && arr[2][2] == 2) ||     // rows

                ((arr[0][0] == 2 && arr[1][0] == 2 && arr[2][0] == 2) ||
                        (arr[0][1] == 2 && arr[1][1] == 2 && arr[2][1] == 2) ||
                        (arr[0][2] == 2 && arr[1][2] == 2 && arr[2][2] == 2)) ||   // column

                ((arr[0][0] == 2 && arr[1][1] == 2 && arr[2][2] == 2) ||
                        (arr[0][2] == 2 && arr[1][1] == 2 && arr[2][0] == 2)))    // diagonal
        {
            return playerTwo;
        }
        if ((arr[0][0] == 1 && arr[0][1] == 1 && arr[0][2] == 1) ||
                (arr[1][0] == 1 && arr[1][1] == 1 && arr[1][2] == 1) ||
                (arr[2][0] == 1 && arr[2][1] == 1 && arr[2][2] == 1) ||

                ((arr[0][0] == 1 && arr[1][0] == 1 && arr[2][0] == 1) ||
                        (arr[0][1] == 1 && arr[1][1] == 1 && arr[2][1] == 1) ||
                        (arr[0][2] == 1 && arr[1][2] == 1 && arr[2][2] == 1)) ||

                ((arr[0][0] == 1 && arr[1][1] == 1 && arr[2][2] == 1) ||
                        (arr[0][2] == 1 && arr[1][1] == 1 && arr[2][0] == 1))) {
            return playerOne;
        }
        return null;
    }
}