package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class pro12932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        solution(num);
    }

    public static int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            answer[i] = Character.getNumericValue(str.charAt(str.length()-1-i));
        }
        return answer;
    }
}
