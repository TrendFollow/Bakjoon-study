package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pro12947 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        System.out.println(solution(num));
    }

    public static boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        String str = String.valueOf(x);

        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }

        answer = x % sum == 0;

        return answer;
    }
}
