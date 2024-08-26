package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pro12948 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(solution(str));
    }

    public static String solution(String phone_number) {
        String last = phone_number.substring(phone_number.length() - 4);
        String first = phone_number.substring(0, phone_number.length() - 4);

        first = first.replaceAll(".", "*");

        return first + last;
    }
}
