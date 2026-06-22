package oop_exercises.encapsulation.ex04;

import java.util.Scanner;

public class TestTicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        boolean running = true;
        int moveCount = 0;

        while (running) {
            game.showBoard();
            int row = 0;
            int column = 0;
            boolean validMove = false;

            while (!validMove) {
                System.out.println("\nChoose a row 1-3: ");
                row = Integer.parseInt(sc.nextLine());

                System.out.println("\nChoose a column 1-3: ");
                column = Integer.parseInt(sc.nextLine());

                row--;
                column--;

                if (game.makeMove(row, column)) {
                    validMove = true;
                } else {
                    System.out.println("Invalid postion! Try again.");
                }

            }

            moveCount++;

            if (game.hasWinner()) {
                game.showBoard();
                if (game.getCurrentPlayer() == 'X') {
                    System.out.println("Player 1 (X) won the game!");
                } else {
                    System.out.println("Player 2 (O) won the game!");
                }
                running = false;

            } else if (moveCount == 9) {
                game.showBoard();
                System.out.println("It's a tie!");
                running = false;
            }

            game.nextPlayer();
        }
        sc.close();
    }
}