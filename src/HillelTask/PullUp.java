package HillelTask;

import java.util.Scanner;

public class PullUp {
    public static void main(String[] args) {
        int sumpPull = 0;
        int breakTime = 60;
        int allBreakTime = 0;
        int timeSumPull = 5;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number approaches  of pull-ups from 1 to 20: ");
        if (s.hasNextInt()) {
            int approaches = s.nextInt();
            if (approaches >= 1 && approaches <= 20) {
                for (int i = 1; i <= approaches; i++) {
                    sumpPull = sumpPull + i;
                    if (i == approaches) {
                        break;
                    }
                    allBreakTime += breakTime;
                    breakTime = breakTime + breakTime * 20 / 100;
                }
                int allPullUpTime = allBreakTime + sumpPull * timeSumPull;
                System.out.println("Total number of pull-ups: " + sumpPull + " times");
                System.out.println("The total break time was: " + allBreakTime + " seconds");
                System.out.println("The total " + approaches + " approaches time was: " + allPullUpTime + " seconds");
                System.out.print("The total " + approaches + " approaches time was: ");
                System.out.printf("%02d:%02d:%02d", (allPullUpTime / 60) / 60, (allPullUpTime / 60) % 60, allPullUpTime % 60);
                System.out.println(" hh:mm:ss");
            } else {
                System.out.println("Enter the number from 1 to 20");
            }
        } else {
            System.out.println("Enter an integer !!!");
        }
    }
}
