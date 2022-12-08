package src;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int D = input.nextInt();
        int H = input.nextInt();
        int W = input.nextInt();

        double result = Math.pow(D,2) / (Math.pow(H,2) + Math.pow(W,2));

        System.out.println((int)Math.sqrt(result * Math.pow(H,2)) + " " + (int)Math.sqrt(result * Math.pow(W, 2)));

    }
}
