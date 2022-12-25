package src.baekjoon;

import java.util.Scanner;

public class OK5554 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 4; i++) {
            int num = input.nextInt();
            sum += num;
        }

        int x = sum/60;
        int y = sum%60;

        System.out.println(x);
        System.out.println(y);

    }
}
