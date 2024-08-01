package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pro2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int index = 1;

        for (int i = len; i > 0 ; i--) {
            for (int j = i-1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <index ; j++) {
                System.out.print("*");

            }
            index++;
            System.out.println();
        }
    }
}
