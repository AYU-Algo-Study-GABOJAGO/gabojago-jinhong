package week06_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q11047_boj {
    /**
     * 메모리: 14252 KB  (/ 256000 KB)
     * 시간:  128 ms    (/ 1000 ms)
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Integer[] coins = new Integer[N];

        for (int i = 0; i < N; i++)
            coins[i] = Integer.parseInt(br.readLine());
        Arrays.sort(coins, Comparator.reverseOrder());

        int result = 0;
        for (int i = 0; i < coins.length; i++) {
            result += K / coins[i];
            K %= coins[i];
        }
        System.out.println(result);
    }
}
