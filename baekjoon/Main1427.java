package src.baekjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main1427 { // 배열 역정렬 문제
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        String str = Integer.toString(N);
        String[] arr = str.split("");

        Integer[] num = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int change = Integer.parseInt(arr[i]);
            num[i] = change;
        }

        Arrays.sort(num, Collections.reverseOrder());

        String result = "";
        for (int i = 0; i < num.length; i++) {
            result += num[i];
        }

        System.out.println(result);
    }
}
