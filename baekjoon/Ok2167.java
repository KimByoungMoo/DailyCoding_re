package src.baekjoon;

import java.util.Scanner;

public class Ok2167 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();

        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int num = input.nextInt();
                arr[i][j] = num;
            }
        }

        int K = input.nextInt();
        for (int k = 0; k < K; k++) {
            int i = input.nextInt();
            int j = input.nextInt();
            int x = input.nextInt();
            int y = input.nextInt();
            int sum = 0;
            for (int n = i - 1; n < x; n++) {
                for (int m = j - 1; m < y; m++) {
                    sum += arr[n][m];
                }
            }
            System.out.println(sum);
        }
    }
}
