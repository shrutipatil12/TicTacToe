package com.thoughtworks;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) throws PositionAlreadyOccupiedException {
        Scanner sc = new Scanner(System.in);

        Player playerOne = new Player();
        Player playerTwo = new Player();
        Player currentPlayer = playerOne;

        Board board = new Board(playerOne, playerTwo);

        for (int i = 0; i < 6; i++) {
            System.out.println("Enter the move");
            int playerPlayedMoves = sc.nextInt();

            board.move(playerPlayedMoves, currentPlayer);
            System.out.println(playerPlayedMoves + " turn " + currentPlayer);

            if (i % 2 == 0) {
                currentPlayer = playerTwo;
            } else {
                currentPlayer = playerOne;
            }
        }
        board.winner();
    }
}
