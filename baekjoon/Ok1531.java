package src.baekjoon;

import java.util.Scanner;

public class Ok1531 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();

        int[][] arr = new int[101][101];

        for (int i = 0; i < N; i++) {
            int leftX = input.nextInt();
            int leftY = input.nextInt();
            int rightX = input.nextInt();
            int rightY = input.nextInt();
            for (int j = leftX; j <= rightX; j++) {
                for (int k = leftY; k <= rightY; k++) {
                    arr[j][k] += 1;
                }
            }
        }

        int count = 0;
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                if (arr[i][j] > M) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
