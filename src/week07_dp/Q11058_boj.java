package week07_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11058_boj {
    /**
     * 메모리: 14356 KB  (/ 256000 KB)
     * 시간:  128 ms    (/ 1000 ms)
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Long[] DP = new Long[N + 1];

        for (int i = 0; i <= N; i++) {
            DP[i] = 0L;
        }

        for (int i = 1; i <= N; i++) {
            DP[i] = DP[i - 1] + 1;

            for (int j = 2; j <= i - 2; j++) {
                DP[i] = Math.max(DP[i], DP[j] * (i - j - 1));
            }
        }

        System.out.println(DP[N]);
    }
}
