package week09_binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10815_boj {
    /**
     * 메모리: 105384 KB  (/ 256000 KB)
     * 시간:  1348 ms    (/ 2000 ms)
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] cards = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cards);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int n = Integer.parseInt(st.nextToken());
            // 주어지는 n에 대해 갖고있는 cards 탐색
            sb.append(binarySearch(cards, n)).append(" ");
        }

        System.out.println(sb);
    }

    private static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return 1;
            else if (arr[mid] < key)
                low = mid + 1;
            else high = mid - 1;
        }
        return 0;
    }

}
