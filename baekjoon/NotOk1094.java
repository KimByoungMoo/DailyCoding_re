package src.baekjoon;

import java.util.Scanner;

public class NotOk1094 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int X = input.nextInt();

        int start = 64;
        int count = 0;
        while(X > 0) {
            if (start > X) {
                start = start/2;
            } else {
                count++;
                X = X - start;
            }
        }
        System.out.println(count);
    }
}
