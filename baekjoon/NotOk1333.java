package src.baekjoon;


import java.util.ArrayList;
import java.util.Scanner;

public class NotOk1333 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int L = input.nextInt();
        int D = input.nextInt();
        ArrayList<Boolean> sec = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < L; j++) {
                sec.add(true);
            }
            if (i != N-1) {
                for (int j = 0; j < 5; j++) {
                    sec.add(false);
                }
            }
        }

        // 질문사항 : 왜 for문은 범위 애러가 나고 while 문은 애러가 안나는가??
        int result = 0;
        for (int i = 0; i < sec.size(); i++) {
            if (sec.get(result) == false) {
                break;
            }
            result += D;
        }

        System.out.println(sec);
        System.out.println(result);
    }
}
