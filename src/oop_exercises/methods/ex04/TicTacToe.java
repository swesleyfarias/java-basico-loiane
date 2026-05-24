package oop_exercises.methods.ex04;

public class TicTacToe {
    char[][] board = new char[3][3];
    char currentPlayer = 'X';

    void createBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
    }

    void showBoard() {
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
    }

    void nextPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }

    boolean verificateMove(int row, int column) {
        if (row < 0 || row > 2 || column < 0 || column > 2) {
            return false;
        }

        if (board[row][column] != ' ') {
            return false;
        }
        return true;
    }

    boolean checkRows() {
        for (int i = 0; i < 3; i++) {
            int rowCount = 0;
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == currentPlayer) {
                    rowCount++;
                }
            }

            if (rowCount == 3) {
                return true;
            }
        }
        return false;
    }

    boolean checkColumns() {
        for (int i = 0; i < 3; i++) {
            int columnCount = 0;
            for (int j = 0; j < 3; j++) {
                if (board[j][i] == currentPlayer) {
                    columnCount++;
                }
            }

            if (columnCount == 3) {
                return true;
            }
        }
        return false;
    }

    boolean checkDiagonal() {
        int diagonalCount = 0;
        for (int i = 0; i < 3; i++) {
            if (board[i][i] == currentPlayer) {
                diagonalCount++;
            }

            if (diagonalCount == 3) {
                return true;
            }
        }
        return false;
    }

    boolean checkAntiDiagonal() {
        int antidiagonalCount = 0;
        for (int i = 0; i < 3; i++) {
            if (board[0 + i][2 - i] == currentPlayer) {
                antidiagonalCount++;
            }

            if (antidiagonalCount == 3) {
                return true;
            }
        }
        return false;
    }

    boolean hasWinner() {
        if (checkRows() || checkColumns() || checkDiagonal() || checkAntiDiagonal()) {
            return true;
        }
        return false;
    }
}
