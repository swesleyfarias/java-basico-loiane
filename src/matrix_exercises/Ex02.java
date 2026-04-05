package matrix_exercises;

import java.util.Random;

public class Ex02 {
    public static void main(String[] args) {
        Random randomNumbers = new Random();

        int[][] matrix = new int[10][10];
        int highestRow, lowestRow;
        int highestCol, lowestCol;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = randomNumbers.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        highestRow = matrix[5][0];
        lowestRow = matrix[5][0];
        highestCol = matrix[0][7];
        lowestCol = matrix[0][7];

        for (int j = 0; j < matrix.length; j++) {
            if (matrix[5][j] > highestRow) {
                highestRow = matrix[5][j];
            }
            if (matrix[5][j] < lowestRow) {
                lowestRow = matrix[5][j];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][7] > highestCol) {
                highestCol = matrix[i][7];
            }
            if (matrix[i][7] < lowestCol) {
                lowestCol = matrix[i][7];
            }
        }

        System.out.println("\nHighest value of row 5: " + highestRow);
        System.out.println("Lowest value of row 5: " + lowestRow);
        System.out.println("Highest value of column 7: " + highestCol);
        System.out.println("Lowest value of column 7: " + lowestCol);
    }
}
