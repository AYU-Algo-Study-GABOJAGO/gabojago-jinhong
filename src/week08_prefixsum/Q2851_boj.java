package week08_prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2851_boj {
    /**
     * 메모리: 14188 KB  (/ 128000 KB)
     * 시간:  128 ms    (/ 1000 ms)
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] toad = new int[10];
        for (int i = 0; i < 10; i++) {
            toad[i] = Integer.parseInt(br.readLine());
        }

        int tmp = 0;
        int result = 0;

        for (int t : toad) {
            tmp += t;

            if (Math.abs(100 - tmp) < Math.abs(100 - result)) {
                result = tmp;
            }

            else if (Math.abs(100 - tmp) == Math.abs(100 - result)) {
                result = Math.max(tmp, result);
            }
        }

        System.out.println(result);
    }
}
