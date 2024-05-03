package week04.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q16953_Jinhong_Jang {
    /**
     * 메모리: 91252 KB  (/ 256000 KB)
     * 시간:  472 ms    (/ 1000 ms)
     */

    static Long A, B;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());

        System.out.println(BFS());
    }

    public static int BFS() {
        Queue<Long> queue = new LinkedList<>();
        queue.add(A);

        count = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                System.out.println(queue);
                Long poll = queue.poll();
                if (poll == B) {    //poll이 아니라 맨 뒤에 값임
                    count++;
                    return count;
                }
                if (poll * 2 <= B) {
                    queue.add(poll * 2);
                }
                if (poll * 10 + 1 <= B) {
                    queue.add(poll * 10 + 1);
                }
            }
            count++;

        }
        return -1;
    }
}

