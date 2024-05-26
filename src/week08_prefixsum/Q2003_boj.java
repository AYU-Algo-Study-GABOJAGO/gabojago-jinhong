package week08_prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2003_boj {
    /**
     * 메모리: 14996 KB  (/ 128000 KB)
     * 시간:  152 ms    (/ 500 ms)
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        int[] num = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0, end = 0;
        long sum = 0;
        int result = 0;

        while (true) {
            if (sum >= M) {
                /** M보다 같거나 클 경우 그 다음 원소를 시작으로 한다 */
                sum -= num[start++];
            } else if (end == N) {
                /** 원소 끝까지 순회했다면 반복문 종료 */
                break;
            } else {
                /** M보다 작고 끝까지 순회하지 않았다면 
                 * 부분합 증가 -> end 늘리기 */
                sum += num[end++];
            }

            if (sum == M) {
                result++;
            }
        }

        System.out.println(result);
    }
}
