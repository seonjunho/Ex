package Nks6;

import Ex.S;

import java.util.Scanner;

public class hanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        hanoi(1,2,3,num);
    }

    public static void hanoi(int from, int m, int to, int num){
        if(num==0)
            return;

        hanoi(from,to,m,num-1);
        System.out.printf("%d : %d -> %d\n",num,from,to);
        hanoi(m,from,to,num-1);
    }
}
