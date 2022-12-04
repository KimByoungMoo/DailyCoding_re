package src;


import java.util.Scanner;

public class BasketBall {
    public static void main(String[] args) {
        // 백준 1159번 문제
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        char[] first = new char[num];
        int[] alp = new int[26];
        int count = 0;

        for (int i = 0; i < first.length; i++) {
            String name = sc.next();
            first[i] = name.charAt(0);
            alp[first[i]-97]++;
        }

        for (int i = 0; i < alp.length; i++) {
            if (alp[i] >= 5) {
                System.out.print((char)(i+97));
                count++;
            }
        }

        if (count == 0) {
            System.out.print("PREDAJA");
        }

    }
}
