package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pro12934 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(solution(num));
    }

    public static long solution(long n) {
        long answer = 0;
        long sqrt = (long) Math.sqrt(n);
        if (sqrt * sqrt == n) {
            answer = (long) Math.pow(sqrt+1, 2);
        }else {
            answer = -1;
        }
        return answer;
    }
}
