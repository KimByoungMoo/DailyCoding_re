package src.baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class NotOk2635 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int count = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = n; i >= n/2; i--) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(n);

            int temp = n;
            int temp2 = i;

            while (true) {
                if (temp < 0) {
                    break;
                }

                int temp3 = temp;
                if (temp2 >= 0) {
                    list.add(temp2);
                }

                temp = temp2;
                temp2 = temp3 - temp;
            }

            if (count < list.size()) {
                count = list.size();
                result = list;
            }
        }

        System.out.println(count);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}
