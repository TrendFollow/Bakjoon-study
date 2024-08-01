package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pro12944 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        solution(arr);
    }

    public static double solution(int[] arr) {
        double answer = 0;
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        answer = (double) sum/arr.length;


        return answer;
    }
}