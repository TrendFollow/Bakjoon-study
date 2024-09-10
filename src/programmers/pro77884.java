package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pro77884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] arr = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        System.out.println(solution(arr[0], arr[1]));
    }

    public static int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {

            // i가 제곱수인지 확인하여 약수의 개수가 홀수인지 짝수인지 판단
            int sqrt = (int) Math.sqrt(i);
            if (sqrt * sqrt == i) {
                answer -= i;
            } else {
                answer += i;
            }
        }

        return answer;
    }
}
