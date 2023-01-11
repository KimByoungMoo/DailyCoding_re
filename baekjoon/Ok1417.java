package src.baekjoon;

import java.util.Scanner;

public class Ok1417 {
    public static void main(String[] arts) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int count = 0;
        int[] arr = new int[N];
        for (int i = 0; i < N; i ++) {
            int M = input.nextInt();
            arr[i] = M;
        }

        while(true) {
            int max = 0;
            int num = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    num = i;
                }
            }
            if (arr[0] <= max) {
                arr[0] += 1;
                arr[num] -= 1;
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
