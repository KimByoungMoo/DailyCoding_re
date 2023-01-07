package src.baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

// 소수 구하는 문제
public class Ok2581 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int M = input.nextInt();
        int N = input.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        int count = 0;
        for (int i = 2; i <= N; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 1 && i >= M) {
                list.add(i);
            }
            count = 0;
        }

        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        if (list.size() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(list.get(0));
        }
    }
}
