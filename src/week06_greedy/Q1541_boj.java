package week06_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1541_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String input = st.nextToken();
        String str = "";
        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            str += c;
            if (c == '-') {
                for (int j = i+1; j <input.length(); j++) {
                    if (j == input.length()-1) break;
                    if (input.charAt(j + 1) != '+') {
                        result += c - '0';
                        System.out.println(result);
                    }
                }
                System.out.println("str: " + str);
            }
        }

    }
}