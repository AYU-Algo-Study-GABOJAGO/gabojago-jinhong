package week06_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.StringTokenizer;

import static java.util.Arrays.*;

public class Q1946_boj {
    /**
     * 메모리: 307520 KB  (/ 256000 KB)
     * 시간:  3224 ms    (/ 2000 ms)
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int[][] rank = new int[N][2];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                rank[i][0] = Integer.parseInt(st.nextToken());
                rank[i][1] = Integer.parseInt(st.nextToken());
            }

            sort(rank, Comparator.comparingInt(o -> o[0]));
            int min = rank[0][1]; // 1차 1등의 2차 순위 (무조건 합격)
            int cnt =  1;
            for (int i = 0; i < N; i++) {
                if (rank[i][1] < min) {
                    min = rank[i][1];   // 1차 순위 필터링을 위함
                    cnt++;
                }
            }

            System.out.println(cnt);
        }
    }
}
