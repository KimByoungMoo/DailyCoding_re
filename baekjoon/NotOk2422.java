package src.baekjoon;


import java.util.Scanner;

// 조합을 활용한 문제, 알고리즘 조합문제 공부할때 꼭 다시 볼 것
public class NotOk2422 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();


        boolean[][] match = new boolean[N+1][N+1];
        for (int i = 0; i < M; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            match[a][b] = true;
            match[b][a] = true;
        }


        int result = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                if (match[i][j]) continue;
                for (int k = j + 1; k <= N; k ++) {
                    if (!match[j][k] && !match[k][i]) {
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
