package src.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Ok2822 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            int n = input.nextInt();
            arr[i] = n;
        }

        int[] copy = Arrays.copyOf(arr, 8);
        Arrays.sort(copy);

        int sum = 0;
        for (int i = 7; i > 2; i--) {
            sum += copy[i];
        }

        int[] order = new int[8];

        for (int i = 0; i < copy.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (copy[i] == arr[j]) {
                    order[i] = j + 1;
                }
            }
        }

        int[] result = Arrays.copyOfRange(order, 3, 8);
        Arrays.sort(result);

        String change = "";
        for (int i = 0; i < result.length; i++) {
            change += Integer.toString(result[i]) + " ";
        }

        System.out.println(sum);
        System.out.println(change);

    }
}
