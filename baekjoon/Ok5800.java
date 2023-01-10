package src.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Ok5800 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int K = input.nextInt();

        int min = 0;
        int max = 0;
        for (int i = 0; i < K; i++) {
            int N = input.nextInt();
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                int score = input.nextInt();
                arr[j] = score;
            }
            Arrays.sort(arr);
            int gap = 0;
            int largeGap = 0;
            for (int k = 1; k < arr.length; k++) {
                gap = Math.abs(arr[k-1] - arr[k]);
                if (gap > largeGap) {
                    largeGap = gap;
                }
            }
            min = arr[0];
            max = arr[arr.length - 1];
            System.out.println("Class " + (i+1));
            System.out.println("Max " + max +"," + " Min " + min + "," + " Largest gap " + largeGap);
            System.out.printf("Class %d\n", (i+1));
            System.out.printf("Max %d, Min %d, Largest gap %d\n", max, min, largeGap);
        }
    }
}
