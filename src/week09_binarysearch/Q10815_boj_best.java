package week09_binarysearch;
import java.io.*;
import java.util.*;

public class Q10815_boj_best {
    /**
     * 메모리: 116220 KB  (/ 256000 KB)
     * 시간:  716 ms    (/ 2000 ms)
     */

    static final int CARD_MAX = 10000000;

        public static void main(String[] args) throws IOException{
            StringBuilder sb = new StringBuilder();

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            boolean[] cards = new boolean[CARD_MAX * 2];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < N ; i++) {
                int num = Integer.parseInt(st.nextToken());
                cards[num + CARD_MAX] = true;
            }

            int M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < M ; i++) {
                int target = Integer.parseInt(st.nextToken());
                if (cards[target + CARD_MAX]) {
                    sb.append(1).append(" ");
                } else {
                    sb.append(0).append(" ");
                }
            }
            System.out.println(sb);
        }
}
