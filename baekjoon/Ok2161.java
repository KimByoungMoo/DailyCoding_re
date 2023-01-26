package src.baekjoon;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ok2161 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        Queue<Integer> list = new LinkedList<>();

        String result = "";
        String space = " ";

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }


        int count = 0;
        int num = 2;
        while(true) {
            count++;

            if (count > N * 2) {
                break;
            }

            if (count % 2 == 1) {
                result += list.poll() + space;
            } else {
                list.add(list.poll());
            }
        }

        System.out.println(result);

    }
}
