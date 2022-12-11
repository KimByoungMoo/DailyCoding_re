package src;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        BigInteger sum1 = new BigInteger("0");
        for (int i = 0; i < num1; i++) {
            BigInteger numA = new BigInteger(br.readLine());
            sum1 = sum1.add(numA);
        }

        long result1 = sum1.longValue();

        int num2 = Integer.parseInt(br.readLine());
        BigInteger sum2 = new BigInteger("0");
        for (int i = 0; i < num2; i++) {
            BigInteger numA = new BigInteger(br.readLine());
            sum2 = sum2.add(numA);
        }

        long result2 = sum2.longValue();

        int num3 = Integer.parseInt(br.readLine());
        BigInteger sum3 = new BigInteger("0");
        for (int i = 0; i < num3; i++) {
            BigInteger numA = new BigInteger(br.readLine());
            sum3 = sum3.add(numA);
        }

        long result3 = sum3.longValue();

        if (result1 == 0) {
            System.out.println("0");
        } else if (result1 > 0) {
            System.out.println("+");
        } else if (result1 < 0) {
            System.out.println("-");
        }

        if (result2 == 0) {
            System.out.println("0");
        } else if (result2 > 0) {
            System.out.println("+");
        } else if (result2 < 0) {
            System.out.println("-");
        }

        if (result3 == 0) {
            System.out.println("0");
        } else if (result3 > 0) {
            System.out.println("+");
        } else if (result3 < 0) {
            System.out.println("-");
        }
    }
}

