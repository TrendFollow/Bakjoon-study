package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pro70128 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] arr = new int[4];

        String[] str = br.readLine().split(" ");
        int[] num = new int[4];

        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < 4; i++) {
            num[i] = Integer.parseInt(str[i]);
        }

        solution(arr, num);
    }

    public static int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}
