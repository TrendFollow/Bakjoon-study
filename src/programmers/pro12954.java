package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class pro12954 {
    public static void main(String[] args) throws IOException {
        String str1 = new BufferedReader(new InputStreamReader(System.in)).readLine();
        int num1 = Integer.parseInt(str1);

        String str2 = new BufferedReader(new InputStreamReader(System.in)).readLine();
        int num2 = Integer.parseInt(str2);

        solution(num1, num2);
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i + 1);
        }

        return answer;
    }
}
