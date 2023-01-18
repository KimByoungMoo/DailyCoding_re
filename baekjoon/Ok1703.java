package src.baekjoon;

import java.util.Scanner;

public class Ok1703 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            int N = input.nextInt();
            int result = 1;
            if (N == 0) {
                break;
            }

            for (int i = 0; i < N; i++) {
                int wood = input.nextInt();
                int cut = input.nextInt();
                result = (result * wood) - cut;
            }
            System.out.println(result);
        }
    }
}
