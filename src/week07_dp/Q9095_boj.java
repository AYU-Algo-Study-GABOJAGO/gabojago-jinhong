package week07_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9095_boj {
    /**
     * 메모리: 14076 KB  (/ 512000 KB)
     * 시간:  120 ms    (/ 1000 ms)
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int[] DP = new int[11];
            DP[1] = 1;
            DP[2] = 2;
            DP[3] = 4;
            for (int i = 4; i <= N; i++) {
                DP[i] = DP[i - 1] + DP[i - 2] + DP[i - 3];
            }

            System.out.println(DP[N]);
        }

    }
}
