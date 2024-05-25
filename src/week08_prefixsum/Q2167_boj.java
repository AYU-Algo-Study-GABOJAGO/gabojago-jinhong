package week08_prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2167_boj {
    /**
     * 메모리: 48304 KB  (/ 128000 KB)
     * 시간:  1632 ms    (/ 2000 ms)
     */


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int K = Integer.parseInt(br.readLine());
        while (K-- > 0) {
            int[] IJ = new int[2];
            int[] XY = new int[2];

            st = new StringTokenizer(br.readLine());
            IJ[0] = Integer.parseInt(st.nextToken());
            IJ[1] = Integer.parseInt(st.nextToken());
            XY[0] = Integer.parseInt(st.nextToken());
            XY[1] = Integer.parseInt(st.nextToken());

            long result = 0;
            for (int i = IJ[0]; i <= XY[0]; i++) {
                for (int j = IJ[1]; j <= XY[1]; j++) {
                    result += arr[i][j];
                }
            }
            System.out.println(result);
        }

    }
}
