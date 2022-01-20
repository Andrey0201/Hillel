package HillelTask;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DegreeRecursion {
    public static void main(String[] args) {

        System.out.println("Enter the number you want to raise to a power: ");
        int value = readerNumber();
        System.out.println("Enter the power");
        int powValue = readerNumber();
        System.out.printf("Number%2d to the power%3d = %3d", value, powValue, pow(value, powValue));
    }

    public static int readerNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            System.out.print("Enter integer  from 1 to 5: ");
            if (!scanner.hasNextInt()) {
                System.out.println("You entered a non-integer! Repeat!");
                scanner.next();
            } else {
                number = scanner.nextInt();
                if (number >= 1 && number <= 5) {
                    return number;
                } else {
                    System.out.println("You entered a number out of range! Repeat!");
                }
            }
        }
    }

    public static int pow(int value, int powValue) {
        if (powValue == 0) {
            return 1;
        }
        return value * pow(value, powValue - 1);
    }
}
