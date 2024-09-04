package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pro12922 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        System.out.println(solution(num));
    }

    public static String solution(int n) {
        String answer1 = "수";
        String answer2 = "박";
        String answer3 = "";

        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                answer3 += answer1;
                answer3 += answer2;
            }
        }else {
            for (int i = 0; i < n / 2; i++) {
                answer3 += answer1;
                answer3 += answer2;
            }
            answer3 += answer1;
        }

        return answer3;
    }
}
