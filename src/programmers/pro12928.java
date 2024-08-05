package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class pro12928 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());


        System.out.println(solution(len));
    }

    public static int solution(int n) {
        int answer = 0;
        double sqrt = Math.sqrt(n);

        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                if (Math.pow(i, 2) == n) {
                    answer += i;
                } else {
                    answer += i;
                    answer += n / i;
                }
            }
        }
        return answer;
    }
}
