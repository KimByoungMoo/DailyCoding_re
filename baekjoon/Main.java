package src.baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
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
        List<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < K; k++) {
                    result = Integer.toString(A[i][j] * B[j][k]);
                    list.add(result);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("0")) {
                list.remove(i);
            }
        }



        String change = "";
        for (int i = 0; i < list.size(); i++) {
            change += list.get(i) + " ";
        }
        System.out.println(change);
    }
}
