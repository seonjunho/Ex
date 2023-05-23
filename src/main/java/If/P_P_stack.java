package If;


import java.util.Scanner;
import java.util.Stack;

public class P_P_stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            int s = sc.nextInt();

            if (s == 0) {
                st.pop();
            } else {
                st.push(s);
            }
        }

        int sum = 0;
        for (int O : st) {
            sum += O;
        }
    }
}
