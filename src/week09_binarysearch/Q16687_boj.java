package week09_binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q16687_boj {
    /**
     * 메모리: 14208 KB  (/ 256000 KB)
     * 시간:  128 ms    (/ 500 ms)
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());

        System.out.println(findN(M));
    }

    private static int findN(int M) {
        if(M == 0) return 0;
        int low = 0, high = 5 * (M + 1);
        while (low < high) {
            int mid = (low + high) / 2;
            if (trailingZeros(mid) < M) {
                low = mid + 1;
            } else high = mid;
        }

        return trailingZeros(low) == M ? low : -1;
    }

    //후행 0
    private static int trailingZeros(int N) {
        int cnt = 0;
        while (5 <= N) {
            N /= 5;
            cnt += N;
        }

        return cnt;
    }
}
