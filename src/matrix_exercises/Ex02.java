package matrix_exercises;

import java.util.Random;

public class Ex02 {
    public static void main(String[] args) {
        Random randomNumbers = new Random();

        int[][] matrix = new int[10][10];
        int highestRow = Integer.MIN_VALUE, highestCol = Integer.MIN_VALUE;
        int lowestRow = Integer.MAX_VALUE, lowestCol = Integer.MAX_VALUE;

        int targetRow = 5, targetCol = 7;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = randomNumbers.nextInt(100);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int j = 0; j < matrix[targetRow].length; j++) {
            if (matrix[targetRow][j] > highestRow) {
                highestRow = matrix[targetRow][j];
            }
            if (matrix[targetRow][j] < lowestRow) {
                lowestRow = matrix[targetRow][j];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][targetCol] > highestCol) {
                highestCol = matrix[i][targetCol];
            }
            if (matrix[i][targetCol] < lowestCol) {
                lowestCol = matrix[i][targetCol];
            }
        }

        System.out.println("\nHighest value of row 5: " + highestRow);
        System.out.println("Lowest value of row 5: " + lowestRow);
        System.out.println("Highest value of column 7: " + highestCol);
        System.out.println("Lowest value of column 7: " + lowestCol);
    }
}
