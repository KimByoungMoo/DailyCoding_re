package src;

import java.util.Arrays;

public class P35 {
    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 7, 6};
        int[] result = new int [arr.length];
        quicksort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        System.out.println(Arrays.toString(result));
    }

    static void swap(int[] data, int alpha, int beta) {
        int temp = data[alpha];
        data[alpha] = data[beta];
        data[beta] = temp;
    }

    static int partition(int[] data, int left, int right) {
        int pivot = data[(left + right)/2];
        while (left <= right) {
            while (data[left] < pivot) {
                left ++;
            }
            while (data[right] > pivot) {
                right--;
            }
            if (left <= right) {
                swap(data, left, right);
                left ++;
                right --;
            }
        }
        return left;
    }

    private static void quicksort(int[] data, int left, int right) {
        int part = partition(data, left, right);
        if (left < part - 1) {
            quicksort(data, left, part - 1);
        }
        if (right > part) {
            quicksort(data, part, right);
        }
    }

}
