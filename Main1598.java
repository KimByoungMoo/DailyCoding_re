package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1598 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int a = A%4;
        if (A%4 == 0) {
            a = 4;
        }

        int b = B%4;
        if (B%4 == 0) {
            b = 4;
        }

        int c = A/4;
        if (A%4 != 0) {
            c = A/4+1;
        }

        int d = B/4;
        if (B%4 != 0) {
            d = B/4+1;
        }

        int v = Math.abs(a-b);
        int h = Math.abs(c-d);
        int result = v + h;

        System.out.println(result);
    }
}
