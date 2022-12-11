package src;

import java.util.Arrays;
import java.util.Scanner;

public class Main1350 { //1350문제 틀렸음, 시간초과뜸, 버퍼리더를 사용해서 재도전 해봐야함
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        long[] arr = new long[N];

        for (int i = 0; i < N; i++) {
            long F = input.nextInt();
            arr[i] = F;
        }

        long C = input.nextInt();

        long result = 0;
        long[] arr2 = new long[N];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > C && arr[i] != 0) {
                while (true) {
                    result += C;
                    if (arr[i] <= result && arr[i] != 0) {
                        arr2[i] = result;
                        result = 0;
                        break;
                    }
                }
            } else if (arr[i] <= C && arr[i] != 0) {
                arr2[i] = C;
            } else if (arr[i] == 0) {
                arr2[i] = 0;
            }
        }

        long sum = 0;
        for (int j = 0; j < arr2.length; j++) {
            sum += arr2[j];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(sum);
    }
}
