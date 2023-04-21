package org.example;

import java.util.Scanner;

public class Basic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int hour;

        System.out.print("시급 : ");
        a = sc.nextInt();
        System.out.print("일한 시간 입력 : ");
        hour = sc.nextInt();

        int sum = a * hour;
        System.out.println(sum);
    }
}
