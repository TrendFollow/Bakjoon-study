package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pro12925 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        System.out.println(solution(s));
    }

    public static int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);

        return answer;
    }
}
