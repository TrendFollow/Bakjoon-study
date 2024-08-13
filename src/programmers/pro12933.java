package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pro12933 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());


        System.out.println(solution(len));
    }

    public static long solution(long n) {
        String str = String.valueOf(n);
        int[] digits = new int[10];

        for (int i = 0; i < str.length(); i++) {
            digits[str.charAt(i) - '0']++;
        }

        StringBuilder sortedStr = new StringBuilder();
        for (int i = 9; i >= 0 ; i--) {
            while (digits[i] > 0) {
                sortedStr.append(i);
                digits[i]--;
            }
        }

        return Long.parseLong(sortedStr.toString());
    }
}
