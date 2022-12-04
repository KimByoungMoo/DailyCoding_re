package src;

import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        for (int i = 0; i < 8; i++) {
            String chess = sc.nextLine();
            String[] arr = chess.split("");
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0 && j % 2== 0 &&"F".equals(arr[j])) {
                    result++;
                } else if (i % 2 != 0 && j % 2 != 0 && "F".equals(arr[j])) {
                    result++;
                }
            }
        }

        System.out.println(result);

    }
}
