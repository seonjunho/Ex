package org.example;

import java.util.Scanner;

public class Ex_001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ;

        System.out.println("값 입력");
        a = sc.nextInt();

        if (a % 3==0 && a % 5 ==0){
            System.out.print("3의 배수 5의 배수 만족");
        } else if (a % 5==0) {
            System.out.print("5의 배수");
        } else if (a % 3==0) {
            System.out.print("3의 배수");
        }
    }
}
