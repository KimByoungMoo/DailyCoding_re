package src.baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class NotOk1247 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            BigInteger sum = new BigInteger("0");
            int N = Integer.parseInt(br.readLine());

            for (int j = 0; j < N; j++) {
                BigInteger num1 = new BigInteger(br.readLine());
                sum = sum.add(num1);
            }

            if (sum.compareTo(BigInteger.ZERO) == -1) {
                System.out.println("-");
            } else if (sum.compareTo(BigInteger.ZERO) ==1) {
                System.out.println("+");
            } else {
                System.out.println(0);
            }
        }
    }
}

