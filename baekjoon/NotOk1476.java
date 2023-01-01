package src.baekjoon;

import java.util.Scanner;

public class NotOk1476 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int resultDay = y;
        for (int i = 0; i < x -1; i++) {
            resultDay += month[i];
        }

        System.out.println(day[resultDay % 7]);

    }
}