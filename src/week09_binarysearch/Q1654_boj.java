package week09_binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1654_boj {
    /**
     * 메모리: 17956 KB  (/ 128000 KB)
     * 시간:  208 ms    (/ 2000 ms)
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());     // 갖고 있는 개수
        int N = Integer.parseInt(st.nextToken());    // 필요한 개수
        long[] lan = new long[K];

        for (int i = 0; i < K; i++) {
            lan[i] = Long.parseLong(br.readLine());
        }
        Arrays.sort(lan);

        long low = 0, high = Integer.MAX_VALUE;
        long result = 0;
        while (low <= high) {
            int cnt = 0;
            long mid = (low + high) / 2;
            for (int i = 0; i < lan.length; i++) {
                cnt += (int) (lan[i] / mid);
            }

            if (cnt < N) {
                high = mid - 1;
            } else {
                low = mid + 1;
                result = Math.max(result, mid);
            }
        }

        System.out.println(result);
    }
}
