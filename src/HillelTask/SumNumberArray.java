package HillelTask;

public class SumNumberArray {
    public static void main(String[] args) {
        int[] array = {55555, 55555, 44444, 66666};
        int sumNumber = 0;
        for (int element : array) {
            int number = element;
            while (number > 0) {
                sumNumber += number % 10;
                number = number / 10;
            }
        }
        System.out.println("The sum of the digits of the elements of the array:" + sumNumber);
    }
}

