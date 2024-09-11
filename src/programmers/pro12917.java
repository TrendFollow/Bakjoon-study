package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pro12917 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        System.out.println(solution(s));
    }

    public static String solution(String s) {
        // 문자열을 char 배열로 변환
        char[] arr = s.toCharArray();

        // 선택 정렬 알고리즘을 사용해 내림차순으로 정렬
        for (int i = 0; i < arr.length - 1; i++) { // 0 ~ 5
            // 최대값의 인덱스를 찾음
            int maxIdx = i;
            for (int j = i + 1; j < arr.length; j++) { // 1 ~ 6
                // 내림차순: 더 큰 값일 때 교환
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            // 현재 위치와 최대값 위치의 값을 교환
            char temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

        }

        return new String(arr);
    }

//    public static String solution(String s) {
//        Character[] chars = new Character[s.length()];
//
//        for (int i = 0; i < s.length(); i++) {
//            chars[i] = s.charAt(i);
//        }
//
//        Arrays.sort(chars, Collections.reverseOrder());
//
//        StringBuilder sb = new StringBuilder();
//        for (char c : chars) {
//            sb.append(c);
//        }
//
//        return sb.toString();
//    }
}
