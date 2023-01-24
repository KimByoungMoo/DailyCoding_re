package src.baekjoon;

import java.util.Scanner;

public class NotOk1439 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();

        int zero = 0;
        int one = 0;

        if (str.charAt(0) == '0') {
            zero ++;
        } else {
            one++;
        }

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i-1) != str.charAt(i)) {
                if (str.charAt(i) == '0') {
                    zero++;
                } else {
                    one++;
                }
            }
        }

        System.out.println(Math.min(zero,one));

    }
}
