package src.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Ok2535 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[][] arr = new int[n][3];
        int[] arrScore = new int[n];

        for (int i = 0; i < n; i++) {
            int nation = input.nextInt();
            int student = input.nextInt();
            int score = input.nextInt();
            arr[i][0] = nation;
            arr[i][1] = student;
            arr[i][2] = score;
            arrScore[i] = score;
        }

        Arrays.sort(arrScore);

        int[][] copy = new int[n][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arrScore.length; j++) {
                if (arr[i][2] == arrScore[j]) {
                    copy[j] = arr[i];
                }
            }
        }

        int goldNation = copy[n-1][0];
        int goldStudent = copy[n-1][1];
        int silverNation = copy[n-2][0];
        int silverStudent = copy[n-2][1];
        int bronzeNation = 0;
        int bronzeStudent = 0;
        int count = 3;
        while(true) {
            if (copy[n-1][0] == copy[n-2][0] && copy[n-1][0] == copy[n-count][0]) {
                count++;
            } else {
                bronzeNation = copy[n-count][0];
                bronzeStudent = copy[n-count][1];
                break;
            }
        }

        System.out.print(goldNation + " " + goldStudent + "\n" +
                silverNation + " " + silverStudent + "\n" +
                bronzeNation + " " + bronzeStudent);
    }
}
