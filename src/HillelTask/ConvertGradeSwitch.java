package HillelTask;

import java.util.Scanner;

public class ConvertGradeSwitch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("To convert from a 12-point system to a 5-point system, enter a grade from 1 to 12: ");
        if (s.hasNextInt()) {
            int grade = s.nextInt();
            switch (grade) {
                case 1:
                case 2:
                case 3: {
                    System.out.println("On a five-point system, this is a grade of 2");
                    break;
                }
                case 4:
                case 5:
                case 6: {
                    System.out.println("On a five-point system, this is a grade of 3");
                    break;
                }
                case 7:
                case 8:
                case 9: {
                    System.out.println("On a five-point system, this is a grade of 4");
                    break;
                }
                case 10:
                case 11:
                case 12: {
                    System.out.println("On a five-point system, this is a grade of 5");
                    break;
                }
                default: {
                    System.out.println("Enter an integer from 1 to 12!!!");
                }
            }
        } else {
            System.out.println("Enter an integer !!!");
        }
    }
}

