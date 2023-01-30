package src.baekjoon;


import java.util.Scanner;

public class Ok1769 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long X = input.nextInt();

        int count = 0;
        int sum = 0;


        while (true) {
            String str = Long.toString(X);
            String[] arr = str.split("");
            sum = 0;

            int[] num = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                num[i] = Integer.parseInt(arr[i]);
            }

            for (int i = 0; i < num.length; i++) {
                sum += num[i];
            }

            count++;
            X = sum;
            if (sum < 10) {
                break;
            }
        }

        if (sum % 3 == 0) {
            System.out.print(count +"\n" + "YES");
        } else {
            System.out.print(count + "\n" + "NO");
        }
    }
}
