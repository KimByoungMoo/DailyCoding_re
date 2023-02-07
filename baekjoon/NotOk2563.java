package src.baekjoon;

import java.util.Scanner;

public class NotOk2563 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int n = input.nextInt();
        int[][] arr = new int[100][100];

        int count = 0;
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            for (int j = x; j < x+10; j++) {
                for (int k = y; k < y+10; k++) {
                    arr[j][k] = 1;
                    }
                }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (arr[i][j] == 1) {
                    count ++;
                }
            }
        }

        System.out.println(count);
    }
}
