package com.thoughtworks;

class TicTacToe {

    public static void main(String[] args) throws PositionAlreadyOccupiedException {

        Player playerOne = new Player();
        Player playerTwo = new Player();

        Board board = new Board(playerOne, playerTwo);
        Game game = new Game();
        for (int i = 0; i < 6; i++) {
            board.move(game.playerInput());
        }
        board.winner();
    }
}
