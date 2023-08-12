package study;

public class C_Quizz22_02_1 {
    public static void main(String[] args) {
        int a = 27;
        int b = 12;
        int l, g = 0;

        for (int i = b; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                g = i;
                break;
            }
        }
        l = a * b / g;
        System.out.printf("%d", g + l);
    }
}
