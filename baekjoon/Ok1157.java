package src.baekjoon;

import java.util.Scanner;

public class Ok1157 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();
        String change = str.toUpperCase();
        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int num = change.charAt(i);
            arr[num-65] += 1;
        }

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int index = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                count ++;
                if (count == 1) {
                    index = i;
                } else if (count >= 2) {
                    index = -2;
                }
            }
        }

        int num2 = index + 65;
        char result = (char)num2;

        System.out.println(result);
    }
}




