package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pro12903 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        System.out.println(solution(s));
    }

    public static String solution(String s) {
        String answer = "";

        if (s.length() % 2 == 1) {
            answer = String.valueOf(s.charAt(s.length() / 2));

        } else {
            int i = s.length() / 2;
            answer = String.valueOf(s.charAt(i -1)) + String.valueOf(s.charAt(i));
        }

        return answer;
    }
}
