package src.baekjoon;

import java.util.Scanner;

public class Ok2742 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int result = 0;
        for (int i = 0; i < N; i++) {
            result = N - i;
            System.out.println(result);
        }
    }
}
