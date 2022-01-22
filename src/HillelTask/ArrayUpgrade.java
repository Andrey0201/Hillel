package HillelTask;

import java.util.Scanner;

public class ArrayUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        while (true) {
            System.out.print("Enter integer  from 1 to 100: ");
            if (!scanner.hasNextInt()) {
                System.out.println("You entered a non-integer! Repeat!");
                scanner.next();
            } else {
                a = scanner.nextInt();
                if (a >= 1 && a <= 100) {
                    break;
                } else {
                    System.out.println("You entered a number out of range! Repeat!");
                }
            }
        }

        double[] array = new double[a];
        double min = -50.00;
        double max = 50.00;
        double number;
        for (int i = 0; i < array.length; i++) {
            number = min + Math.random() * (max - min);
            array[i] = number;
            System.out.printf("%.2f|", array[i]);
        }
        System.out.println();
        double sumElement = 0;
        double maxElement = array[0];
        double minElement = array[0];
        for (double element : array) {
            sumElement += element;
            if (element > maxElement) {
                maxElement = element;
            }
            if (element < minElement) {
                minElement = element;
            }
        }
        System.out.printf("""
                        Maximal element array = %.2f
                        Minimum element array = %.2f
                        Sum elements array = %.2f
                        Arithmetic mean of array elements = %.2f""",
                maxElement, minElement, sumElement, sumElement / array.length);

    }
}
