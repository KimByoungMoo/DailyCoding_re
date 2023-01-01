package src.baekjoon;


import java.util.Scanner;

public class Ok1789 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long S = input.nextLong();

        long sum = 1;
        long num = 2;
        int count = 0;

        while(true) {
            sum += num;
            num++;
            count++;
            if(sum > S) {
                break;
            }
        }
        System.out.println(count);
    }
}
