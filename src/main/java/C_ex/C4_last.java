package C_ex;

import java.util.Scanner;

public class C4_last {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.print("년도를 입력하세요 : ");
        a = sc.nextInt();

        if(a%4==0 && a%100!=0 || a%400==0){
            System.out.printf("%d 년은 윤년입니다.",a);
        }else{
            System.out.println("윤년이 아닙니다.");
        }
    }
}
