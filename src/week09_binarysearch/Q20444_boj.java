package week09_binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q20444_boj {
    /**
     * 메모리: 14236 KB  (/ 1024000 KB)
     * 시간:  128 ms    (/ 100 ms)
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        long K = Long.parseLong(st.nextToken());
        boolean ch = false;
        long low = 0, high = N;

        while (low <= high) {
            long mid = (low + high) / 2;
            long V = N - mid;
            long cut = (mid + 1) * (V + 1);

            if (cut == K) {
                ch = true;
                break;
            } else if(cut < K)
                low = mid + 1;
            else high = mid - 1;
        }

        System.out.println(ch ? "YES" : "NO");
    }
}
