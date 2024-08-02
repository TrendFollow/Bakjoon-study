package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class pro12931 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());

        solution(len);
    }

        public static int solution(int n) {
            int answer = 0;
            String str = String.valueOf(n);

            for (int i = 0; i < str.length(); i++) {
                answer += Character.getNumericValue(str.charAt(i));
            }

            return answer;
        }
}