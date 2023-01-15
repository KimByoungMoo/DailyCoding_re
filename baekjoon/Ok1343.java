package src.baekjoon;

import java.util.Scanner;

public class Ok1343 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();

        if (str.indexOf("XXXX") != -1) {
            str = str.replace("XXXX", "AAAA");
            if (str.indexOf("XX") != -1) {
                str = str.replace("XX", "BB");
            }
        } else if (str.indexOf("XX") != -1) {
            str = str.replace("XX", "BB");
            if (str.indexOf("XXXX") != -1) {
                str = str.replace("XXXX", "AAAA");
            }
        }

        if (str.indexOf("X") != -1) {
            System.out.println("-1");
        } else System.out.println(str);
    }
}
