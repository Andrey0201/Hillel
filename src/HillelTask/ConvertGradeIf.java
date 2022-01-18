package HillelTask;

import java.util.Scanner;

public class ConvertGradeIf {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("To convert from a 12-point system to a 5-point system, enter a grade from 1 to 12: ");
        if (s.hasNextInt()) {
            int grade = s.nextInt();
            if (grade >= 1 && grade <= 3) {
                System.out.println("On a five-point system, this is a grade of 2");
            } else if (grade >= 4 && grade <= 6) {
                System.out.println("On a five-point system, this is a grade of 3");
            } else if (grade >= 7 && grade <= 9) {
                System.out.println("On a five-point system, this is a grade of 4");
            } else if (grade >= 10 && grade <= 12) {
                System.out.println("On a five-point system, this is a grade of 5");
            } else {
                System.out.println("Enter an integer from 1 to 12!!!");
            }

        } else {
            System.out.println("Enter an integer !!!");
        }
    }
}
