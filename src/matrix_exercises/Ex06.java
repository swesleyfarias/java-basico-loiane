package matrix_exercises;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];
        boolean running = true;
        boolean win = false;
        int moveCount = 0;

        char player1 = 'X';
        char player2 = 'O';
        char currentPlayer = player1;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }

        while (running) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (j == 2) {
                        System.out.print(board[i][j]);
                    } else {
                        System.out.print(board[i][j] + "|");
                    }

                }
                System.out.println("");
            }

            int row = 0;
            int column = 0;
            boolean validMove = false;

            while (!validMove) {
                do {
                    System.out.println("\nChoose a row 1-3: ");
                    row = Integer.parseInt(sc.nextLine());

                    if (row < 1 || row > 3) {
                        System.out.println("Invalid position.");
                    }

                } while (row < 1 || row > 3);

                do {
                    System.out.println("\nChoose a column 1-3: ");
                    column = Integer.parseInt(sc.nextLine());

                    if (column < 1 || column > 3) {
                        System.out.println("Invalid position.");
                    }

                } while (column < 1 || column > 3);

                row--;
                column--;
                if (board[row][column] == player1 || board[row][column] == player2) {
                    System.out.println("This square is taken.");
                } else {
                    validMove = true;
                }
            }

            moveCount++;
            board[row][column] = currentPlayer;

            // 1. Rows wins

            for (int i = 0; i < 3; i++) {
                int rowCount = 0;
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == currentPlayer) {
                        rowCount++;
                    }
                }

                if (rowCount == 3) {
                    win = true;
                }
            }
            // 2. Columns wins
            for (int i = 0; i < 3; i++) {
                int columnCount = 0;
                for (int j = 0; j < 3; j++) {
                    if (board[j][i] == currentPlayer) {
                        columnCount++;
                    }
                }

                if (columnCount == 3) {
                    win = true;
                }
            }
            // 3. Diagonal wins
            int diagonalCount = 0;
            for (int i = 0; i < 3; i++) {
                if (board[i][i] == currentPlayer) {
                    diagonalCount++;
                }

                if (diagonalCount == 3) {
                    win = true;
                }
            }

            // 4. Anti diagonal wins
            int antidiagonalCount = 0;
            for (int i = 0; i < 3; i++) {
                if (board[0 + i][2 - i] == currentPlayer) {
                    antidiagonalCount++;
                }

                if (antidiagonalCount == 3) {
                    win = true;
                }
            }

            if (win) {
                if (currentPlayer == player1) {
                    System.out.println("Player 1 (X) won the game!");
                } else {
                    System.out.println("Player 2 (O) won the game!");
                }
                running = false;

            } else if (moveCount == 9) {
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board[i].length; j++) {
                        if (j == 2) {
                            System.out.print(board[i][j]);
                        } else {
                            System.out.print(board[i][j] + "|");
                        }

                    }
                    System.out.println("");
                }
                System.out.println("It's a tie!");
                running = false;
            }

            if (currentPlayer == player1) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }
        }
        sc.close();
    }
}