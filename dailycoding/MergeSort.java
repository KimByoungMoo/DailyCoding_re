package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {4, 7, 4, 3, 9, 1, 2};

        int[] result = sort(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] leftArr = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] rightArr = sort(Arrays.copyOfRange(arr, mid, arr.length));

        int[] mergeArr = new int[arr.length];
        int m = 0, l = 0, r = 0;
        while (l < leftArr.length && r < rightArr.length) {
            if (leftArr[l] < rightArr[r]) {
                mergeArr[m++] = leftArr[l++];
            } else {
                mergeArr[m++] = rightArr[r++];
            }
        }

        while (l < leftArr.length) {
            mergeArr[m++] = leftArr[l++];
        }

        while (r < rightArr.length) {
            mergeArr[m++] = rightArr[r++];
        }

        return mergeArr;
    }
}
