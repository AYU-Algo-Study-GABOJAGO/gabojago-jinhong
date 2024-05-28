package week08_prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q14465_boj {
    /**
     * 메모리: 14852 KB  (/ 512000 KB)
     * 시간:  140 ms    (/ 2000 ms)
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[] lights = new int[N + 1];
        Arrays.fill(lights, 0);

        for (int i = 1; i <= B; i++) {
            int b = Integer.parseInt(br.readLine());
            lights[b] = b;
        }

        int cnt = 0;
        for (int i = 1; i <= K; i++) {
            if (lights[i] != 0) {
                cnt++;
            }
        }
        int result = cnt;
        for (int i = K + 1; i <= N; i++) {
            if(lights[i-K] != 0) cnt--;
            if(lights[i] != 0) cnt++;
            result = Math.min(cnt, result);
        }

        System.out.println(result);
    }
}
