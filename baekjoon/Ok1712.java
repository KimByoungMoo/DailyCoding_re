package src.baekjoon;

import java.util.Scanner;

public class Ok1712 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (b >= c) {
            System.out.println(-1);
        } else {
            System.out.println((a/(c-b))+1);

        }
    }
}
