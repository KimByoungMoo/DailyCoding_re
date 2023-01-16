package src;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4, 5, 6};
        int target = 2;

        int left = 0;
        int right = arr.length-1;

        int index = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                index = mid;
                break;
            }
            if (target < arr[mid]) {
                right --;
            } else if (target > arr[mid]){
                left ++;
            }
        }

        if (index == 0) {
            index = -1;
        }
        System.out.println(index);
    }
}
