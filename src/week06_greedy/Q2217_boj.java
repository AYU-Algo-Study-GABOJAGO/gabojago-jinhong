package week06_greedy;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;

public class Q2217_boj {
    /**
     * 메모리: 109628 KB  (/ 192000 KB)
     * 시간:  976 ms    (/ 2000 ms)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] weight = new int[N];
        int k = 0;

        for (int i = 0; i < N; i++) weight[i] = sc.nextInt();
        Arrays.sort(weight);

        k = weight[0] * N;
        for (int i = 1; i < N; i++) {
            k = max(k, weight[i] * (N - i));
        }

        System.out.println(k);
    }
}
