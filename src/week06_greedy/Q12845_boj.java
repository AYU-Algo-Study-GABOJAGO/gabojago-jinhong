package week06_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q12845_boj {
    /**
     * 메모리: 14344 KB  (/ 512000 KB)
     * 시간:  136 ms    (/ 1000 ms)
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[] cards = new Integer[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cards, Comparator.reverseOrder());

        int gold = 0, level = cards[0];
        for (int i = 1; i < cards.length; i++) {
            gold += level + cards[i];
        }

        System.out.println(gold);
    }
}
