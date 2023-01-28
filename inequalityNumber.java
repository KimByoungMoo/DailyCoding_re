package src;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        long output = inequalityNumber("<");
        System.out.println(output);


    }

    public static long inequalityNumber(String signs) {
        String[] arr = signs.split(",");
        int[] digits = new int[]{0,1,2,3,4,5,6,7,8,9};
        int[] reversDigits = new int[]{9,8,7,6,5,4,3,2,1,0};
        long min = aux(-1, arr, new String[]{}, digits, new boolean[10]);
        long max = aux(-1, arr, new String[]{}, reversDigits, new boolean[10]);
        return max - min;
    }

    public static long aux(int idx, String[] signs, String[] nums, int[] digits, boolean[] isVisited) {
        if(idx == signs.length) {
            String result = String.join("", nums);
            return Long.parseLong(result);
        }

        String sign;

        if(idx != -1) {
            sign = signs[idx];
        } else {
            sign = "NULL";
        }
        for (int i = 0; i < digits.length; i++) {
            int right = digits[i];
            if (isVisited[right]) {
                continue;
            }

            if (idx >= 0) {
                int left = Integer.parseInt(nums[nums.length - 1]);
                if(sign.equals("<") && left >= right) {
                    continue;
                }
                if (sign.equals(">") && left <= right) {
                    continue;
                }
            }

            isVisited[right] = true;
            String[] stringArr = Arrays.copyOf(nums, nums.length + 1);
            stringArr[stringArr.length - 1] = String.valueOf(right);
            long target = aux(idx + 1, signs, stringArr, digits, isVisited);

            if (target != -1) {
                return target;
            }

            isVisited[right] = false;
        }
        return -1;
    }


}
