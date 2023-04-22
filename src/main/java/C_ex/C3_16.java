package C_ex;

import java.util.Scanner;

public class C3_16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;

        System.out.print("입력진수 결정 <1>10 <2>16 <3>8 :");
        a = sc.nextInt();

            System.out.print("값 입력 : ");
            b = sc.nextInt();
            if(a == 1){
                System.out.printf("10진수 ==>%d\n",b);
            } else if (a == 2) {
                System.out.printf("16진수 ==>%x\n",b);
            } else if (a == 3) {
                System.out.printf("8진수 ==>%o\n",b);
            }
        }
    }
