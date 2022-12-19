package src;

import java.util.Arrays;

public class P22 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{3,7,1,4,2,5})));
    }

    public static int[] swap(int idx1, int idx2, int[] arr) {
        int temp = arr[idx1];
        arr [idx1] = arr[idx2];
        arr[idx2] = temp;

        return arr;
    }

    public static int[] bubbleSort(int[] arr) {
        int arrLength = arr.length;

        for (int i = 0; i < arrLength; i++) {
            int swaps = 0;
            for (int j = 0; j < arrLength; j++) {
                swaps++;
                arr = swap(j,j+1,arr);
            }
            if (swaps == 0) {
                break;
            }
        }
        return arr;
    }
}



