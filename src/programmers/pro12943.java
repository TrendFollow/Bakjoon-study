package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pro12943 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());

        System.out.println(solution(len));
    }

    public static int solution(int num) {
        long answer = num;
        int count = 0;

        while (count <= 500) {
            System.out.println(count);
            if (count >= 500) {
                return -1;
            }

            if (count == 0 && num == 1) {
                return 0;
            }

            if (answer % 2 == 0) {
                if (answer == 1) {
                    return count;
                }
                answer = answer / 2;
                count++;

            } else if (answer % 2 == 1){
                if (answer == 1) {
                    return count;
                }
                answer = (answer * 3) + 1;
                count++;

            }


        }

        return count;
    }
}
