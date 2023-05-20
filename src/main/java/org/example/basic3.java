package org.example;

import java.util.Scanner;

public class basic3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int e = sc.nextInt();
        double euro = 1320.48026;
        double dallar = 1063.82979;

        int sum =(int)((d*euro) + (e*dallar));
        System.out.print("58유로 + 32달러 = "+ sum +" 원");

    }
}
