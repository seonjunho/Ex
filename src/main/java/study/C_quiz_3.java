package study;

import java.util.Scanner;

public class C_quiz_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("입력진수 결정 <1>10 <2>16 <3>8 : ");
        a = sc.nextInt();

        if (a == 1) {
            System.out.print("값 입력: ");
            b = sc.nextInt();

            System.out.printf("10진수 ==> %d \n", b);
            System.out.printf("16진수 ==> %x \n", b);
            System.out.printf("8진수 ==> %o \n", b);
        } else if (a == 2) {
            System.out.print("값 입력: ");
            b = Integer.parseInt(sc.next(), 16);  // sc.next로 문자로 변환해 받은 후 parseInt를 이용해 진수로 변경.

            System.out.printf("10진수 ==> %d \n", b);
            System.out.printf("16진수 ==> %x \n", b);
            System.out.printf("8진수 ==> %o \n", b);
        } else if (a == 3) {
            System.out.print("값 입력: ");
            b = Integer.parseInt(sc.next(), 8);

            System.out.printf("10진수 ==> %d \n", b);
            System.out.printf("16진수 ==> %x \n", b);
            System.out.printf("8진수 ==> %o \n", b);
        } else {
        }
    }
}
