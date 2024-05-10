package week06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4796_boj {
    /**
     * 메모리: 16436 KB  (/ 128000 KB)
     * 시간:  216 ms    (/ 1000 ms)
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int i = 0;
        int result = 0;

        while (true) {
            st = new StringTokenizer(br.readLine());

            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken()); //연속 하는 P일 중 L일
            int V = Integer.parseInt(st.nextToken());

            if (L == 0 && P == V && V == 0) break;

            result = (V / P) * L + Math.min(L, V % P);

            System.out.println("Case " + ++i + ": " + result);
        }
    }
}
