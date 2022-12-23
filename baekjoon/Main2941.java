package src.baekjoon;


import java.util.Scanner;

public class Main2941 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=" ,"z="};

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (str.contains(arr[i])) {
                str = str.replace(arr[i], "!");
            }
        }
        result = str.length();

        System.out.println(result);
    }
}
