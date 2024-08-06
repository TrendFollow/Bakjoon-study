package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class pro87389 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());

        solution(len);

    }

    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                return i;
            }
        }

        return answer;
    }
}
