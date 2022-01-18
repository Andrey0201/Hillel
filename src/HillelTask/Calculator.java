package HillelTask;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int number1 = readerNumber();
        int number2 = readerNumber();
        int c  = operation(number1,number2);
        System.out.println(c);
    }

    public static int readerNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            System.out.print("Enter integer  from 1 to 100: ");
            if (!scanner.hasNextInt()) {
                System.out.println("You entered a non-integer! Repeat!");
                scanner.next();
            } else {
                number = scanner.nextInt();
                if (number >= 1 && number <= 100) {
                    return number;
                } else {
                    System.out.println("You entered a number out of range! Repeat!");
                }
            }
        }
    }

    public static int operation(int a,int b) {
        Scanner scanner = new Scanner(System.in);
        String operation;
        while (true) {
            System.out.print("Enter operation which do you want  (*) or (/) or (+) or (-)  : ");
            operation = scanner.nextLine();
            switch (operation) {
                case "*":
                    return a * b;
                case "/":
                    return a / b;
                case "+":
                    return a + b;
                case "-":
                    return a - b;
                default:
                    System.out.println("You enter incorrect operation! Try again!");
                    break;
            }

        }
    }
}






