package src;

import java.io.IOException;

public class MainCoding {
    public static void main(String[] args) throws IOException {

        String str = "wwwggoppopppp";

        if(str.length() == 0) {
            System.out.println("");
        }
        char before = str.charAt(0);
        int count = 1;
        String result = "";

        str = str + ' ';
        for (int i = 1; i < str.length(); i++) {
            if (before == str.charAt(i)) {
                count++;
            } else {
                if (count >= 3) {
                    result = result + count + before;
                } else {
                    //count의 수만큼 결과에 문자열을 저장합니다.
                    for(int j = 0; j < count; j++) {
                        result = result + before;
                    }
                    //자바 11에서 지원하는 String.repeat메소드를 활용하면 조금 더 간단하게 작성이 가능합니다.
                    //result = result + Character.toString(before).repeat(count);
                }
                before = str.charAt(i);
                count = 1;
            }
        }
        System.out.println(result);
    }
}
