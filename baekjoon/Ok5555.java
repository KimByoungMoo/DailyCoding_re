package src.baekjoon;

import java.util.Scanner;

public class Ok5555 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String find = input.next();
        int N = input.nextInt();

        int count = 0;
        for (int i = 0; i < N; i++) {
            String str = input.next();
            if (str.contains(find)) {
                count++;
            } else {
                str += str;
                if (str.contains(find)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
