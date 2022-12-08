package src;


import java.util.Arrays;
import java.util.Scanner;

// 백준 1233 주사위 문제 -> 제대로 못풀고 레퍼런스 코드를 참고함
public class Dice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int s1 = input.nextInt();
        int s2 = input.nextInt();
        int s3 = input.nextInt();

        int[] arr = new int[s1*s2*s3];
        int sum = 0;
        int num = 0;
        for (int i = 1; i <= s1; i++) {
            for (int j = 1; j <= s2; j++) {
                for (int k = 1; k <= s3; k++) {
                    sum = i+j+k;
                    arr[num] = sum;
                    num++;
                }
            }
        }
        // 각 주사위에서 나올 수 있는 합을 구하여 해당 값을 배열에 넣어줌 -> 여기까진 혼자서 진행함

        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[arr[i]]++;
        }
        // 배열을 하나 더 만들고 해당 배열에는 arr[i] 번째 인덱스에 해당하는 값이 arr2의 인덱스가 되게 하고 숫자를 1 늘려줌
        // 그래서 복사한 배열의 인덱스 3번 (4번째) 값이 1이 됨 (첫회 반복시 3번 인덱스 값 1 / 숫자 입력 3, 2, 3일 경우)
        // 2회 반복시 arr2의 인덱스 4의 값은 1
        // 3회 반복시 arr2의 인덱스 5의 값은 1
        // 4회 반복시 arr2의 인덱스 4의 값은 1+1 = 2
        // 5회 반복시 arr2의 인덱스 5의 값은 1+1 = 2 ... 이런식으로 중복 된 합계 숫자의 횟수만큼 arr2 배열에 담기게 됨

        int result = 0;
        int max = 0;
        for (int i = 0; i < arr2.length; i++) {
            max = Math.max(max, arr2[i]);
        }
        // 변수 max를 하나 만들고 해당 변수의 값이 arr2의 요소들 중 가장 큰 값이 되도록 함

        for (int i = 0; i < arr2.length; i++) {
            if (max == arr2[i]) {
                result = i;
                break;
            }
        }
        // result 변수를 만들고 arr2 배열을 돌면서 max와 같은값이 보이면 result 변수에 arr2의 인덱스 번호를 부여하고 반복문 종료

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(max);
        System.out.println(result);

    }
}
