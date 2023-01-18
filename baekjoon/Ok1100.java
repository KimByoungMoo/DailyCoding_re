package src.baekjoon;


import java.util.Scanner;

public class Ok1100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;

        for (int i = 0; i < 8; i++) {
            String str = input.next();
            String[] arr = str.split("");
            for (int j = 0; j < arr.length; j++) {
                if (i % 2 == 0 && j % 2 == 0 && "F".equals(arr[j])) {
                    count += 1;
                } else if (i % 2 == 1 && j % 2 == 1 && "F".equals(arr[j])) {
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}
