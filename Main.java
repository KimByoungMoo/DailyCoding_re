package src;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int s1 = 3;
        int s2 = 2;
        int s3 = 3;

        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = new int[s1*s2*s3];

        for (int i = 1; i <= s1; i++) {
            for (int j = 1; j <= s2; j++) {
                for (int k = 1; k <= s3; k++) {
                    sum = i+j+k;
                    list.add(sum);
                }
            }
        }

        int num = 0;
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            num = Math.max(num, list.get(i));
        }

        for (int j = 0; j < list.size(); j++) {
            if (num == list.get(j)) {
                result = j;
                break;
            }
        }

        System.out.println(list);
        System.out.println(Arrays.toString(arr));
        System.out.println(result);

    }
}
