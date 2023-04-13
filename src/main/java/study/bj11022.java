package study;

import java.util.Scanner;
//각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
//백준 11022번
public class bj11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int c;

        for (int i = 1;i <= x; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            c = a+b;
            System.out.printf("Case #%d: %d + %d = %d\n",i,a,b,c);
        }
    }
}
