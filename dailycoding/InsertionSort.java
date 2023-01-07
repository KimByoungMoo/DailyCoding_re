package src;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static int[] insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int num = i;
            while (num > 0 && arr[num-1] > arr[num]) {
                int temp = arr[num - 1];
                arr[num - 1] = arr[num];
                arr[num] = temp;
                num--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 43, 100, 21};

        System.out.println(Arrays.toString(insertionSort(arr)));

    }

}
