package src.baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OK1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int change = 0;
        int sum = 0;

        while(true) {
            int N = Integer.parseInt(br.readLine());


            if (N == 0) {
                break;
            }

            sum = 0;

            String str = Integer.toString(N);
            String[] arr = str.split("");
            for (int i = 0; i < arr.length; i++) {
                if ("1".equals(arr[i])) {
                    sum += 2;
                } else if ("0".equals(arr[i])) {
                    sum += 4;
                } else {
                    sum += 3;
                }
            }
            System.out.println(sum + 2 + arr.length-1);
        }
    }
}
