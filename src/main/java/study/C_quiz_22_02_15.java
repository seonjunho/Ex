package study;

import static java.lang.Math.sqrt;

public class C_quiz_22_02_15 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = i + 2 + i * 2;
        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d",check(arr[i]));
        }
    }

    public static int check(int a) {
        int n = (int) sqrt(a);
        int i = 2;
        while (i <= n) {
            if (n % i == 0) return 0;
            i++;
        }
        return 1;
    }
}