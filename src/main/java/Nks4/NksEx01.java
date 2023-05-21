package Nks4;

import java.util.Scanner;

public class NksEx01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int j;

        System.out.print("값 입력 : ");
        j = sc.nextInt();
        for (int i = 0; i < j; i++){
            System.out.println("안녕하세요"+i);
        }
    }
}
