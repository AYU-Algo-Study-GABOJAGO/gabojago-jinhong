package week07_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q18353_boj_best {
    /**
     * 메모리: 14528 KB  (/ 256000 KB)
     * 시간:  160 ms    (/ 1000 ms)
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] input = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            input[i] = Integer.parseInt(st.nextToken());

        int[] DP = new int[N];
        DP[0] = 1;
        int result = 1;

        for (int i = 1; i < N; i++) {
            DP[i] = 1; //각 병사의 수열

            for (int j = i - 1; j >= 0; j--) {
                // if 현재 병사보다 전투력이 작거나 같으면 then 다음 병사 확인하기
                if (input[i] >= input[j]) continue;

                // else(앞에 있는 병사의 전투력이 현재 병사보다 크다면) then 길이 갱신
                DP[i] = Math.max(DP[i], DP[j] + 1);
                result = Math.max(result, DP[i]);
            }
        }

        System.out.println(N - result);
    }
}
