package HillelTask;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter height in meters (Example:1,70): ");
        double height = s.nextDouble();
        System.out.print("Enter the weight in kilograms (Example:70): ");
        int weight = s.nextInt();
        double index = weight / (height * height);
        System.out.print("Body mass index = " );
        System.out.printf( " %.2f", index);
        System.out.println(" kg/m²");


    }
}
