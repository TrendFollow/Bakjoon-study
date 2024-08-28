package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pro86051 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] numbers = new int[8];
        for (int i = 0; i < 8; i++) {
            numbers[i] = Integer.parseInt(str[i]);
        }

        System.out.println(solution(numbers));
    }

    public static int solution(int[] numbers) {
        int total = 0;
        for (int i = 0; i < 10; i++) {
            total += i;
        }

        int number = 0;
        for (int num : numbers) {
            number += num;
        }

        return total - number;
    }
}
