package src.baekjoon;

import java.util.Scanner;

public class Ok2562 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            int num = input.nextInt();
            arr[i] = num;
        }

        int max = 0;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i+1;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}
