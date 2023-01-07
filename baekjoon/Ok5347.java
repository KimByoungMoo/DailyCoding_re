package src.baekjoon;

import java.util.Scanner;

public class Ok5347 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int result = 0;
        for (int i = 0; i < n; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int j = 1;
            int k = 1;
            while(true) {
                int alpha = 0;
                int beta = 0;
                alpha = a * j;
                beta = b * k;
                if (alpha > beta && !(alpha == beta)) {
                    k += 1;
                    continue;
                } else if (beta > alpha && !(alpha == beta)) {
                    j += 1;
                    continue;
                } else if (alpha == beta) {
                    result = alpha;
                    System.out.println(result);
                    break;
                }
            }
        }
    }
}
