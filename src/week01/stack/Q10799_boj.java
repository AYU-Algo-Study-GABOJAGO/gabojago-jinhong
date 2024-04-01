package week01.stack;

import java.util.Scanner;
import java.util.Stack;

public class Q10799_boj {
    /**
     *  메모리 22936 KB
     *  시간 380 ms
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();

        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                st.push('(');
            } else {
                if (!st.isEmpty() && str.charAt(i-1) == '(') {
                    st.pop();
                    cnt += st.size();
                }
                else {
                    st.pop();
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
