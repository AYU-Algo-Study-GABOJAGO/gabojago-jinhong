package week07_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q18353_boj {
    /**
     * 메모리: 14672 KB  (/ 256000 KB)
     * 시간:  164 ms    (/ 1000 ms)
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] input = new int[N + 1];
        int[] DP = new int[N + 1];
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++)
            input[i] = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            DP[i] = 1; // 병사 자체가 배치가 되므로 1로 초기화
            for (int j = 1; j < i; j++) {
                if (input[j] > input[i]) {
                    /** 현재 길이와 이전까지 연결되었던 최대 길이+1를 비교하여 저장 */
                    DP[i] = Math.max(DP[i], DP[j] + 1);
                }
            }
            result = Math.max(result, DP[i]);
        }

        // 열외 수
        System.out.println(N - result);
    }
}
