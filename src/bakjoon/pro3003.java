package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pro3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String dice = br.readLine();
        String[] str = dice.split(" ");
        int[] first = new int[str.length];
        int[] second = {1,1,2,2,2,8};
        int[] third = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            first[i] = Integer.parseInt(str[i]);
        }

        for (int i = 0; i < first.length; i++) {
            third[i] = second[i] - first[i];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < second.length; i++) {
            sb.append(third[i] + " ");
        }
        System.out.println(sb);

    }

}
