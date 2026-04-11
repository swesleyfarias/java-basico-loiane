package matrix_exercises;

import java.util.Random;

public class Ex01 {
    public static void main(String[] args) {
        Random randomNumbers = new Random();
        int[][] matrix = new int[4][4];
        int highest = Integer.MIN_VALUE;
        int rowPosition = 0, colPosition = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = randomNumbers.nextInt(100);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > highest) {
                    rowPosition = i;
                    colPosition = j;
                }
            }
        }

        System.out.println("\nThe highest number in matrix: " + highest);
        System.out.println("Position:");
        System.out.println("Row: " + rowPosition);
        System.out.println("Column: " + colPosition);
    }
}