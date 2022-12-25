package src.baekjoon;

import java.util.Scanner;

public class OK1546 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        double max = 0;
        double[] arr = new double[num];

        for (int i = 0; i < num; i++) {
            int score = input.nextInt();
            double change = score;
            arr[i] = change;
            if (change > max) {
            max = change;
            }
        }

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i]/max) * 100;
        }

        double result = sum / num;

        System.out.println(result);
    }
}
