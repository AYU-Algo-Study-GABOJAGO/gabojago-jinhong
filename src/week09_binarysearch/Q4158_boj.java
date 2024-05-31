package week09_binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4158_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = 1, M = 1;
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

            int cnt = 0;
            for (int cd : cd1) {
                if (search(cd2, cd)) {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }

    }

    private static boolean search(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return true;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else high = mid - 1;
        }

        return false;
    }

}
