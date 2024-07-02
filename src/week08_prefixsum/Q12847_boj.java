package week08_prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q12847_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] T = new long[N + 1];
        long max = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            T[i] = Integer.parseInt(st.nextToken());
            if(i <= M) max += T[i];
        }

//        int i = 1;
//        while (i - 1 + M < N) {
////            if (i - 1 + M == N) break;
//            long tmp = max - T[i - 1] + T[i - 1 + M];
//            max = Math.max(max, tmp);
//            i++;
//        }
        for (int i = M + 1; i <= N; i++) {
            long tmp = max - T[i - M] + T[i];
            max = Math.max(max, tmp);
        }
//        for (int i = 1; i < N; i++) {
//            long tmp = max - T[i - 1] + T[i - 1 + M];
//            max = Math.max(max, tmp);
//        }

        System.out.println(max);
    }
}
