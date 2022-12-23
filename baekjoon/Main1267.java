package src.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1267 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int Y = 0;
        int M = 0;
        for (int i = 0; i < N; i++) {
            int T = Integer.parseInt(br.readLine());
            Y += ((T/30)+1) * 10;
            M += ((T/60)+1) * 15;
        }

        if (Y == M) {
            System.out.println("Y M " + Y);
        } else if (Y > M) {
            System.out.println("M " + M);
        } else if (Y < M) {
            System.out.println("Y " + Y);
        }

    }
}
