package week09_binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4158_boj_pointer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = 1;
        int M = 1;
        int[] cd1, cd2;
        while (true) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            if (N == 0 && M == 0) break;

            cd1 = new int[N];
            cd2 = new int[M];

            for (int i = 0; i < N; i++) {
                cd1[i] = Integer.parseInt(br.readLine());
            }
            for (int i = 0; i < M; i++) {
                cd2[i] = Integer.parseInt(br.readLine());
            }

            int i = 0, j = 0;
            int cnt = 0;
            while (i < N && j < M) {
                if (cd1[i] == cd2[j]) {
                    cnt++;
                    i++;
                    j++;
                } else if (cd1[i] < cd2[j]) {
                    i++;
                } else { j++; }
            }

            System.out.println(cnt);
        }

    }
}
