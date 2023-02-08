package src.baekjoon;

import java.util.Scanner;

public class Ok2010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] arr = new int[N];

        int count = 0;
        for (int i = 0; i < N; i++) {
            int plug = input.nextInt();
            arr[i] = plug - 1;
            if (i == N - 1) {
                arr[i] = plug;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }

        System.out.println(count);
    }
}
