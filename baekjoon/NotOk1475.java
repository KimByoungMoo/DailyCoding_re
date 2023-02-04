package src.baekjoon;

import java.util.Scanner;

public class NotOk1475 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next();

        int[] arr = new int[10];
        for (int i = 0; i < s.length(); i++) {
            int num = Character.getNumericValue(s.charAt(i));
            if (num == 6) {
                arr[9]++;
            } else {
                arr[num]++;
            }
        }

        int max = 0;
        for (int i = 0; i < 9; i++) {
            max = Math.max(max, arr[i]);
        }

        int nine = arr[9]/2;
        if (arr[9] % 2 == 1) {
            nine ++;
        }
        max = Math.max(max, nine);
        System.out.println(max);
    }
}
