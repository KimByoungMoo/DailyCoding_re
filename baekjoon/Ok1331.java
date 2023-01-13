package src.baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ok1331 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] arr = new int[36][2];
        String[] arr2 = new String[36];
        for (int i = 0; i < 36; i++) {
            String str = input.next();
            arr2[i] = str;
            arr[i][0] = str.charAt(0);
            arr[i][1] = str.charAt(1);
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i-1][0] - arr[i][0]) == 1 && Math.abs(arr[i-1][1] - arr[i][1]) == 2
                || Math.abs(arr[i-1][0] - arr[i][0]) == 2 && Math.abs(arr[i-1][1] - arr[i][1]) == 1) {
                list.add("Valid");
            } else list.add("Invalid");
        }

        if (Math.abs(arr[0][0] - arr[35][0]) == 1 && Math.abs(arr[0][1] - arr[35][1]) == 2 ||
                Math.abs(arr[0][0] - arr[35][0]) == 2 && Math.abs(arr[0][1] - arr[35][1]) == 1) {
            list.add("Valid");
        } else list.add("Invalid");

        Arrays.sort(arr2);
        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i-1].equals(arr2[i])) {
                list.add("Invalid");
            } else list.add("Valid");
        }

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if ("Invalid".equals(list.get(i))) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Valid");
        } else System.out.println("Invalid");
    }
}
