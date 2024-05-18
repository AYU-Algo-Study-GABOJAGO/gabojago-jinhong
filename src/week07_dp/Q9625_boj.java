package week07_dp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q9625_boj {
    /**
     * 메모리: 18416 KB  (/ 128000 KB)
     * 시간:  224 ms    (/ 1000 ms)
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        List<int[]> result = new ArrayList<>();
        result.add(new int[]{-1, -1});
        result.add(new int[]{0, 1}); //1 click
        result.add(new int[]{1, 1}); //2 click
        result.add(new int[]{1, 2}); //3 click

        for (int i = 4; i <= K; i++) {
            int p1 = result.get(i - 2)[0];
            int p2 = result.get(i - 2)[1];
            result.add(new int[]{p1 + result.get(i - 1)[0], p2 + result.get(i - 1)[1]});
        }

        System.out.println(result.get(K)[0] + " " + result.get(K)[1]);
    }
}
