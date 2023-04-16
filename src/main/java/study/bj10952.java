package study;

import java.util.Scanner;

public class bj10952 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true){
            int a = s.nextInt();
            int b = s.nextInt();

            if(0 == a && b == 0){
                break;
            }
            System.out.println(a+b);
        }
    }
}
