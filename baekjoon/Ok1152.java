package src.baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ok1152 {
    public static void main(String[] args) {
        // 백준 1152번 문제, 문장의 단어 갯수를 구하되 중복된 값도 포함하여 출력하라

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        StringTokenizer result = new StringTokenizer(str," ");

        System.out.println(result.countTokens());
    }
}
