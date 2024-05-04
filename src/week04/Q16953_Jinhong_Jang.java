package week04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q16953_Jinhong_Jang {
    /**
     * 메모리: 14232 KB  (/ 512000 KB)
     * 시간:  124 ms    (/ 2000 ms)
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int cnt = 0;

        while (A < B) {
            if (B % 2 == 0)
                B /= 2;
            else if (String.valueOf(B).endsWith("1")) {
                B = Integer.parseInt(String.valueOf(B).substring(0, String.valueOf(B).length() - 1));
            }
            else
                break;

            cnt++;
        }

        if(A != B)
            System.out.println(-1);
        else
            System.out.println(cnt + 1);

    }
}
