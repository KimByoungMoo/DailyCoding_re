package src;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        //백준 1173 운동문제

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int m = input.nextInt();
        int M = input.nextInt();
        int T = input.nextInt();
        int R = input.nextInt();

        int count = 0;
        int result = 0;
        int first = m;

        while (count != N) {
            result++;
            if (m + T <= M) {
                m += T;
                count++;
            } else {
                m -= R;
                if (m < first) {
                    m = first;
                }
            }

            if ((m + T > M) && (m == first)) {
                break;
            }
        }

        if (count != N) {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }

    }
}
