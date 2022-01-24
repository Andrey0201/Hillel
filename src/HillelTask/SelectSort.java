package HillelTask;

import java.util.Arrays;
import java.util.SplittableRandom;

public class SelectSort {
    public static void main(String[] args) {
        SplittableRandom splittableRandom = new SplittableRandom();
        int[] array = splittableRandom.ints(10, -100, 101).toArray();

        System.out.println(Arrays.toString(array));
        selectSort(array);
        System.out.print(Arrays.toString(array));
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;

    }

    public static void selectSort(int[] array) {

        for (int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    swap(array, i, j);
                }
            }
        }
    }
}



