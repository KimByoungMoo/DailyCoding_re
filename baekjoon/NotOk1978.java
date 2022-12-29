package src.baekjoon;


import java.util.Scanner;

public class NotOk1978 {
    public static void main(String[] args) {

        int num = 19;

        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
}
