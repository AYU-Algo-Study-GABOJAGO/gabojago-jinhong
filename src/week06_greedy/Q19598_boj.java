package week06_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q19598_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] room = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            room[i][0] = Integer.parseInt(st.nextToken());
            room[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(room, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]);
        System.out.println(Arrays.deepToString(room));
        int cnt = N;
        int end = room[0][1];
        for (int i = 0; i < N-1; i++) {
            if (end <= room[i + 1][0]) {
                cnt--;
                end = room[i + 1][1];
                continue;
            }
            end = room[i + 1][1];
        }

        System.out.println(cnt);
    }
}
