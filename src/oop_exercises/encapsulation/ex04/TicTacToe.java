package oop_exercises.encapsulation.ex04;

public class TicTacToe {

    private char[][] board = new char[3][3];
    private char currentPlayer = 'X';

    private boolean verificateMove(int row, int column) {
        if (row < 0 || row > 2 || column < 0 || column > 2) {
            return false;
        }

        if (board[row][column] != ' ') {
            return false;
        }
        return true;
    }

    public TicTacToe() {
        createBoard();
    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }

    public boolean makeMove(int row, int column) {

        if (verificateMove(row, column)) {
            this.board[row][column] = currentPlayer;
            return true;
        }
        return false;
    }

    public void createBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void showBoard() {
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

    public void nextPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }

    public boolean checkRows() {
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

    public boolean checkColumns() {
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

    public boolean checkDiagonal() {
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

    public boolean checkAntiDiagonal() {
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

    public boolean hasWinner() {
        if (checkRows() || checkColumns() || checkDiagonal() || checkAntiDiagonal()) {
            return true;
        }
        return false;
    }
}