package src;

import java.util.Scanner;

public class MultipleTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=".repeat(25));
        System.out.println("구구단 프로그램 ver.01");
        System.out.println("=".repeat(25));


        while (true) {
            System.out.print("숫자를 입력 해주세요 (1 ~ 9) : ");
            String num = input.nextLine();
            int result = 1;


            while (!("1".equals(num) || "2".equals(num) || "3".equals(num) || "4".equals(num) || "5".equals(num) || "6".equals(num) || "7".equals(num) || "8".equals(num) || "9".equals(num))) {
                System.out.println("잘못 된 입력입니다");
                System.out.print("(1 ~ 9) 사이의 숫자를 입력 해주세요 : ");
                num = input.nextLine();
            }

            for (int i = 1; i < 10; i++) {
                int change = Integer.parseInt(num);
                result = change * i;
                System.out.printf("%d X %d = %d\n", change, i, result);
            }

            System.out.print("계속 하시겠습니까? (1) 예 (2) 아니오 : ");
            String question = input.nextLine();

            while (!("1".equals(question) || "2".equals(question))) {
                System.out.print("잘못 된 입력입니다. (1) 계속 (2) 중지 : ");
                question = input.nextLine();
            }

            if ("1".equals(question)) {
                continue;
            } else if ("2".equals(question)) {
                break;
            }
        }

    }
}
