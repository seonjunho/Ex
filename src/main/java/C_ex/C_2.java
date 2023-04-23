package C_ex;

import java.util.Scanner;

public class C_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.printf("%d.%02d.%02d",a,b,c);
    }
}
