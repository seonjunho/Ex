package Nks4;

import java.util.Scanner;

public class Nks4_003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ranking;
        char medalcolr;

        System.out.print("순위를 입력하세요 : ");
        ranking = sc.nextInt();
        switch (ranking) {
            case 1:
                medalcolr = 'G';
                break;
            case 2:
                medalcolr = 'S';
                break;
            case 3:
                medalcolr = 'B';
                break;
            default:
                medalcolr = 'A';
        }
        System.out.println(ranking + "등 메달의 색은" + medalcolr + "입니다");
    }
}
