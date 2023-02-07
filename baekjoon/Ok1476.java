package src.baekjoon;

import java.util.Scanner;

public class Ok1476 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int E = input.nextInt();
        int S = input.nextInt();
        int M = input.nextInt();

        int count = 0;
        int e = 0, s = 0, m = 0;
        while(true) {
            e++;
            s++;
            m++;
            count++;
            if (e > 15) e = 1;
            if (s > 28) s = 1;
            if (m > 19) m = 1;

            if (e == E && s == S && m == M) {
                break;
            }
        }

        System.out.println(count);

    }
}
