package HillelTask;


import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            System.out.print("Enter integer  from 2 to 10: ");
            if (!scanner.hasNextInt()) {
                System.out.println("You entered a non-integer! Repeat!");
                scanner.next();
            } else {
                number = scanner.nextInt();
                if (number >= 2 && number <= 10) {
                    break;
                } else {
                    System.out.println("You entered a number out of range! Repeat!");
                }
            }
        }


        int[][] matrix = new int[number][number];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(51) - 50;
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.print("Main diagonal before:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("%4d ", matrix[i][i]);
        }
        System.out.println();
        System.out.print("Secondary diagonal before:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("%4d ", matrix[i][(matrix.length - 1) - i]);
        }
        System.out.println();


        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][i];
            matrix[i][i] = matrix[i][matrix[i].length - i - 1];
            matrix[i][matrix[i].length - i - 1] = temp;
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }


        System.out.print("Main diagonal after:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("%4d ", matrix[i][i]);
        }
        System.out.println();
        System.out.print("Secondary diagonal after:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("%4d ", matrix[i][(matrix.length - 1) - i]);
        }
        System.out.println();
    }
}






