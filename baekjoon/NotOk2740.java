package src.baekjoon;

import java.util.Scanner;

public class NotOk2740 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();

        int[][] A = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int a = input .nextInt();
                A[i][j] = a;
            }
        }

        M = input.nextInt();
        int K = input.nextInt();
        int[][] B = new int[M][K];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < K; j++) {
                int b = input .nextInt();
                B[i][j] = b;
            }
        }

        String result = "";
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < K; k++) {
                    result += Integer.toString(A[i][j] * B[j][k]) + " ";
                }
                if (j == M -1) {
                    result += "\n";
                }
            }
        }
        if (result.contains("0")) {
            result.replace("0", "");
        }
        System.out.println(result);

    }
}
