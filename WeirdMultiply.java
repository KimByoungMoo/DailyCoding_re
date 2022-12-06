package src;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WeirdMultiply {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String A = input.nextLine();
        StringTokenizer st1 = new StringTokenizer(A);
        String B = input.nextLine();
        StringTokenizer st2 = new StringTokenizer(B);

        String a = st1.nextToken();
        String b = st2.nextToken();


        long result = 0;

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                result += (a.charAt(i)-'0') * (b.charAt(j)-'0');
            }
        }
        System.out.println(result);
    }
}
