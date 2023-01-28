package src.baekjoon;

import java.util.Scanner;

public class Ok3034 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int W = input.nextInt();
        int H = input.nextInt();

        for (int i = 0; i < N; i++) {
            int K = input.nextInt();
            if ((W * W) + (H * H) >= (K * K)) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}
