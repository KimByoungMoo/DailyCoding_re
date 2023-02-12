package src.baekjoon;

import java.util.Scanner;

public class Ok1357 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int X = input.nextInt();
        int Y = input.nextInt();

        String[] arrX = Integer.toString(X).split("");
        String[] arrY = Integer.toString(Y).split("");

        String[] revX = new String[arrX.length];
        String[] revY = new String[arrY.length];

        String sumX = "", sumY = "";
        for (int i = 0; i < arrX.length; i++) {
            revX[i] = arrX[arrX.length-1-i];
            sumX += revX[i];
        }
        for (int i = 0; i < arrY.length; i++) {
            revY[i] = arrY[arrY.length-1-i];
            sumY += revY[i];
        }

        int revSum = Integer.parseInt(sumX) + Integer.parseInt(sumY);

        String[] sumRev = Integer.toString(revSum).split("");
        String[] changeRev = new String[sumRev.length];
        String result = "";
        for (int i = 0; i < sumRev.length; i++) {
            changeRev[i] = sumRev[sumRev.length-i-1];
            result += changeRev[i];
        }

        int finalResult = Integer.parseInt(result);

        System.out.println(finalResult);

    }
}
