package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pro76501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 절대값 정수 배열
        String[] str1 = br.readLine().split(" ");
        int[] absolutes = new int[str1.length];

        for (int i = 0; i < str1.length; i++) {
            absolutes[i] = Integer.parseInt(str1[i]);
        }

        String[] str2 = br.readLine().split(" ");
        boolean[] signs = new boolean[str2.length];
        for (int i = 0; i < str2.length; i++) {
            signs[i] = Boolean.parseBoolean(str2[i]);
        }

        System.out.println(solution(absolutes, signs));
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (!signs[i]) {
                answer -= absolutes[i];
            } else {
                answer += absolutes[i];
            }
        }

        return answer;
    }

}
