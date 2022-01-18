package HillelTask;


import java.util.Scanner;

public class Array {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter integer  from 1 to 100: ");
            if (s.hasNextInt()) {
                int a = s.nextInt();
                if (a >= 1 && a <= 100) {
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
                    System.out.printf("Maximal element array = %.2f\n" +
                                    "Minimum element array = %.2f\n" +
                                    "Sum elements array = %.2f\n" +
                                    "Arithmetic mean of array elements = %.2f",
                            maxElement, minElement, sumElement, sumElement / array.length);
                    break;
                } else {
                    System.out.println("You entered a number out of range! Repeat!");
                    s.nextLine();
                }
            } else {
                System.out.println("You entered a non-integer! Repeat!");
                s.nextLine();
            }
        }
    }
}
