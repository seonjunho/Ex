package study;

import java.util.Scanner;

public class bj1330 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();


        if (a > b) System.out.println(">");
        else if (a < b)  System.out.println("<");
        else System.out.println("==");
    }
}
