package study;

import java.util.Scanner;

public class ShowMenu {
    public static void main(String[] args) {

        int List;
        boolean check = true;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("----선택하세요.----");
            System.out.println("1. 집으로 간다.");
            System.out.println("2. 빠르게 집으로간다.");
            System.out.println("3. 집에만 있는다.");
            System.out.println("----질문 선택!----");
            List = sc.nextInt();
            if (List == 1) {
                System.out.println("집!");
            } else if (List == 2) {
                System.out.println("빨리 가자!");
            } else if (List == 3) {
                System.out.println("가만있어야지...");
                check = false;
            } else {
                System.out.println("없는 번호입니다.");
            }
        }while (check) ;
    }
}
