package org.example;

import java.util.Scanner;

public class basic4 {
    public static String getRole(int age) {
        if(age <= 5){
            System.out.println("유아");
        } else if (age >= 6) {
            System.out.println("어린이");
        } else if (age >= 13){
            System.out.println("청소년");
        } else if (age >= 18){
            System.out.println("성인");
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String role = getRole(age);
        System.out.println(role);

    }
}
