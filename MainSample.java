package src;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        String upCase = str.toUpperCase();
        int[] arr = new int[26];


        for(int i = 0; i < upCase.length(); i++) {
            int change = upCase.charAt(i);

            if (65 <= change && change <= 90) {
                arr[change - 65]++;
            }
        }

        int max = -1;
        char result = '?';
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                result = (char) (i+65);
            } else if (arr[i] == max) {
                result = '?';
            }

        }
        System.out.println(result);
    }
}
