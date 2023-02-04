package src.baekjoon;

import java.util.Scanner;

public class Ok1969 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        String[][] arr = new String[n][m];
        for (int i = 0; i < n; i++) {
            String dna = input.next();
            String[] split = dna.split("");
            for (int j = 0; j < m; j++) {
                arr[i][j] = split[j];
            }
        }

        int[][] count = new int[m][4];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j][i].equals("A")) {
                    count[i][0]++;
                } else if (arr[j][i].equals("C")) {
                    count[i][1]++;
                } else if (arr[j][i].equals("G")) {
                    count[i][2]++;
                } else if (arr[j][i].equals("T")) {
                    count[i][3]++;
                }
            }
        }

        int max = 0;
        int numResult = 0;
        String result = "";
        for (int i = 0; i < m; i++) {
            max = 0;
            for (int j = 0; j < 4; j++) {
                numResult += count[i][j];
                if (max < count[i][j]) {
                    max = count[i][j];
                }
            }
            if (max == count[i][0]) {
                result += "A";
            } else if (max == count[i][1]) {
                result += "C";
            } else if (max == count[i][2]) {
                result += "G";
            } else if (max == count[i][3]) {
                result += "T";
            }
            numResult -= max;
        }

        System.out.println(result);
        System.out.println(numResult);
    }
}
