package src.baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ok2678 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        int n = input.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            int j = input.nextInt();
            int k = input.nextInt();
            arr[i][0] = j;
            arr[i][1] = k;
        }

        ArrayList<Integer> lowlist = new ArrayList<>();
        ArrayList<Integer> collist = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == 0) {
                lowlist.add(arr[i][1]);
            } else if (arr[i][0] == 1) {
                collist.add(arr[i][1]);
            }
        }

        int[] low = new int[lowlist.size()];
        int[] col = new int[collist.size()];

        for (int i = 0; i < lowlist.size(); i++) {
            low[i] = lowlist.get(i);
        }

        for (int i = 0; i < collist.size(); i++) {
            col[i] = collist.get(i);
        }

        Arrays.sort(low);
        Arrays.sort(col);

        int lowMax;
        int colMax;
        if (low.length != 0) {
            lowMax = Math.max(low[0], y - low[low.length - 1]);

            for (int i = 1; i < low.length; i++) {
                lowMax = Math.max(lowMax, Math.abs(low[i - 1] - low[i]));
            }
        } else {
            lowMax = y;
        }

        if (col.length != 0) {
            colMax = Math.max(col[0], x - col[col.length - 1]);

            for (int i = 1; i < col.length; i++) {
                colMax = Math.max(colMax, Math.abs(col[i - 1] - col[i]));
            }
        } else {
            colMax = x;
        }

        int result = lowMax * colMax;
        System.out.println(result);
    }
}
